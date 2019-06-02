package com.example.gobang.controller;

import com.alibaba.fastjson.JSON;
import com.example.gobang.domain.Room;
import com.example.gobang.domain.User;
import com.example.gobang.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author psl
 * @date 2019/6/1
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //注册方法
    @PostMapping(value = "/register.do")
    public String register(User user ){
        boolean flag = userService.save(user);
        if (flag) {
            log.info("注册成功");
            return "注册成功";
        }else {
            log.info("注册失败");
            return "注册失败";
        }
    }
    @PostMapping("/login.do")
    //登录方法
    public String login(User user, HttpSession session){
        System.out.println(user);
        boolean flag = userService.login(user,session);
        if (flag) {
            log.info("登录成功");
            return "登录成功";
        }else {
            log.info("登录失败");
            return "登录失败";
        }
    }
    //创建房间
    @RequestMapping("/create.do")
    public String createRoom(String roomName,HttpSession session){
        User user = (User) session.getAttribute("User");
        Room room = new Room(roomName,user.getId());
        boolean flag = userService.createRoom(room);
        if (flag){
            return "创建成功";
        }else {
            return "创建失败";
        }
    }
    //查找房间
    @RequestMapping("/search.do")
    public String searchRoom(String roomName){
        Room room = userService.searchRoom(roomName);
        if (room == null){
            log.info("没有该房间");
            return "没有该房间";
        }else{
            log.info("查找成功");
            return "查找成功" + JSON.toJSONString(room);
        }
    }
    //加入房间
    @RequestMapping("/join.do")
    public String joinRoom(HttpSession session,String roomName){
        User user = (User) session.getAttribute("user");
        int flag = userService.joinRoom(user, roomName);
        if (flag == 0){
            log.info("该房间已满");
            return "该房间已满";
        }else if (flag == 1){
            log.info("成功加入该房间");
            return "成功加入该房间";
        }
        return "";
    }
    @RequestMapping("/change.do")
    public String changeStatus(HttpSession session,String status){
        User user = (User) session.getAttribute("user");
        boolean flag = userService.changeStatus(user.getId(),Boolean.parseBoolean(status));
        if (flag){
            log.info("改变状态成功");
            return "改变状态成功";
        }else{
            log.info("改变状态失败");
            return "改变状态失败";
        }
    }
    @RequestMapping("/check.do")
    public String checkStatus(Room room){
        boolean flag = userService.checkStatus(room);
        if (flag){
            log.info("玩家准备完毕，游戏开始");
            return "玩家准备完毕，游戏开始";
        }else{
            log.info("有玩家未准备");
            return "有玩家未准备";
        }
    }
}
