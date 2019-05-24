package com.example.websocket.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author psl
 * @date 2019/5/23
 */
@Data
public class Message {
    private String name;
    private String msg;
    private String time;
    public Message(String name,String msg){
        this.name = name;
        this.msg = msg;
    }
}
