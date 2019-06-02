package com.example.gobang;

import com.example.gobang.socket.ChatSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GobangApplication {

    public static void main(String[] args) {
//        SpringApplication.run(GobangApplication.class, args);
        SpringApplication springApplication = new SpringApplication(GobangApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        ChatSocket.setApplicationContext(configurableApplicationContext);  // 解决WebSocket不能注入的问题
    }

}
