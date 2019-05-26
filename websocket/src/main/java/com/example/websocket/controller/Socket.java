package com.example.websocket.controller;

import com.alibaba.fastjson.JSON;
import com.example.websocket.domain.Message;
import com.example.websocket.domain.User;
import com.example.websocket.service.SocketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author psl
 * @date 2019/5/22
 */
@Slf4j
@ServerEndpoint("/socket/{id}/{name}")
@Component
public class Socket {
    //用来记录当前连接
    private static volatile int onlineCount = 0;
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象
    private static CopyOnWriteArraySet<Socket> socket  = new CopyOnWriteArraySet<>();
    // 与某个客户端的连接会话，需要通过它来与客户端进行数据收发
    private Session session;
    private final User user = new User();
    private static ApplicationContext applicationContext;
    @Autowired
    private SocketService service;

    @OnOpen
    public void onOpen(Session session, @PathParam("id") long id ,@PathParam("name")String name){
        service = applicationContext.getBean(SocketService.class);
        this.session = session;
        System.out.println(this.session.getId());
        socket.add(this);
        user.setName(name);
        addOnlineCount();
        String all = service.findAll();
        sendOne(all);
        log.info("Open a websocket. id={}, name={}", id, name);

    }
    @OnClose
    public void onClose(){
        socket.remove(this);
        subOnlineCount();
        log.info("Close a websocket. ");
    }
    @OnMessage
    public void onMessage(String message,Session session){
        Message msg = new Message(this.user.getName(),message);
        msg.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        service.insert(msg);
        sendAll(JSON.toJSONString(msg));
        log.info("Receive a message from client: " + message);
    }
    @OnError
    public void onError(@PathParam("message")String message ,Throwable error){
        log.error("Error while websocket. ", error);
    }
    public void sendMessage(String message){
        if (this.session.isOpen()){
            try {
                this.session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void sendOne(String messages){
        if (messages != null){
            sendMessage(messages);
        }

    }
    /**
     * 群发消息
     * @param message
     */
    public void sendAll(String message){
        if (message != null){
            for(Socket sc :socket){
                sc.sendMessage(message);
            }
        }

    }
    public static synchronized int getOnlineCount(){
        return onlineCount;
    }
    public static synchronized void addOnlineCount(){
        Socket.onlineCount++;
    }
    public static synchronized void subOnlineCount(){
        Socket.onlineCount--;
    }
    public static void setApplicationContext(ApplicationContext applicationContext){
        Socket.applicationContext = applicationContext;
    }
}
