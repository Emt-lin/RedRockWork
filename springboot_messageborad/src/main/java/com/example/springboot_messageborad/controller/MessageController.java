package com.example.springboot_messageborad.controller;


import com.example.springboot_messageborad.domain.Message;
import com.example.springboot_messageborad.service.MessageBoardService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author psl
 * @date 2019/3/29
 */
@RestController
public class MessageController {
    @Autowired
    private MessageBoardService messageBoardService;

    @RequestMapping(value = "/findAll",produces = "application/json")
    public String finaAll(){
        String messages = messageBoardService.findAllMessages();
        if (messages != null){
            return messages;
        }else {
            return "没有留言";
        }

    }
    @RequestMapping("/insert")
    public String insertMessage(Message message){
        if (message.getPid()==null){
            message.setPid(0);
        }
        boolean flag = messageBoardService.insertMessage(message);
        if (flag){
            return "插入成功";
        }else {
            return "插入失败";
        }
    }
}
