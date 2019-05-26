package com.example.websocket.controller;

import com.example.websocket.domain.User;
import com.example.websocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author psl
 * @date 2019/5/24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //注册方法
    @PostMapping(value = "/register.do")
    public String register(User user ){
        boolean flag = userService.save(user);
        if (flag) {
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }

        return "";
    }
    @PostMapping("/login.do")
    //登录方法
    public String login( User user, HttpSession session){
        System.out.println(user);
        boolean flag = userService.login(user,session);
        if (flag) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        return "";
    }
    @RequestMapping("/findAll.do")
    //查询所有的用户
    public String findAll(){
        String users = userService.findAll();
        return users;
    }
    @RequestMapping("/add.do")
    //添加朋友
    public String addFriend(String name, HttpSession session){
        boolean flag = userService.addFriend(((User) session.getAttribute("user")).getId(), name);

        return "";
    }
}
