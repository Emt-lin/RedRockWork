package com.example.websocket.controller;

import com.alibaba.fastjson.JSON;
import com.example.websocket.domain.User;
import com.example.websocket.service.SocketService;
import com.example.websocket.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author psl
 * @date 2019/5/26
 */
@RestController
@Slf4j
@RequestMapping("/socket")
public class SocketController {
    //把所有的聊天室放在里面，String——聊天室创建者名，List<User>——一个聊天室的成员
    public static Map<String, Set<User>> chats = new HashMap<>();
    @Autowired
    private SocketService socketService;

    //加入聊天室
    @RequestMapping("/join.do")
    public String joinChatting(HttpSession session,String chatName){
        User user = (User) session.getAttribute("user");
        Set<User> users = chats.get(chatName);
        users.add(user);
        log.info("加入聊天成功");
        return JSON.toJSONString(user);
    }
    //一对一聊天
    @RequestMapping("/one.do")
    public String oneToOneChatting(String name){
        boolean flag = socketService.oneToOne(name);
        if (!flag) {
            log.info("该用户不是你的好友,不能一对一聊天");
            return "该用户不是你的好友,不能一对一聊天";
        }
        return "";
    }
    //创建聊天室
    @RequestMapping("/create.do")
    public String createChat(HttpSession session){
        User user = (User) session.getAttribute("user");
        Set<User> users = new HashSet<>();
        users.add(user);
        chats.put(user.getName(),users);
        log.info("创建聊天室成功");
        return "创建聊天室成功";
    }
}
