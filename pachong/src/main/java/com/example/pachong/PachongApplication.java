package com.example.pachong;

import com.example.pachong.mybatis.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

@SpringBootApplication
@EnableTransactionManagement
public class PachongApplication {

    public static void main(String[] args) {
        SpringApplication.run(PachongApplication.class, args);

    }

}
