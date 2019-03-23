package com.example.demowork.controller;

import com.example.demowork.moddle.User;
import com.example.demowork.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author psl
 * @date 2019/3/21
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TestService service;
    @RequestMapping("/test")
    public String test(User user){
        return service.delete(user);
    }
}
