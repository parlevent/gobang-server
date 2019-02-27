package com.yfzm.gobang.controller;

import com.yfzm.gobang.dto.InMsg;
import com.yfzm.gobang.dto.OutMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class GameController {

    @Autowired
    SimpMessagingTemplate template;

    @MessageMapping("/sendMsg")
    public void sendMsg(InMsg inMsg) {
        template.convertAndSendToUser(inMsg.getReceiver(), "/msg",
                new OutMsg(inMsg.getSender(), inMsg.getX(), inMsg.getY()));
    }

}
