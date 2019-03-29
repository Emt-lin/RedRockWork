package com.example.springboot_messageborad;

import com.example.springboot_messageborad.service.MessageBoardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMessageboradApplicationTests {

    @Test
    public void contextLoads() {
        MessageBoardService messageBoardService = new MessageBoardService();
        String messages = messageBoardService.findAllMessages();
        System.out.println(messages);
    }

}
