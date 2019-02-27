package com.yfzm.gobang.dto;

public class OutMsg {
    private String sender;
    private Integer x;
    private Integer y;

    public OutMsg(String sender, Integer x, Integer y) {
        this.sender = sender;
        this.x = x;
        this.y = y;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
