package com.example.websocket;

import com.example.websocket.controller.SocketController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebsocketApplication {

    public static void main(String[] args) {
//        SpringApplication.run(WebsocketApplication.class, args);
        SpringApplication springApplication = new SpringApplication(WebsocketApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        SocketController.setApplicationContext(configurableApplicationContext);  // 解决WebSocket不能注入的问题
    }

}
