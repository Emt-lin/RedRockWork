package com.example.gobang.controller;

import com.alibaba.fastjson.JSON;
import com.example.gobang.domain.Chess;
import com.example.gobang.domain.User;
import com.example.gobang.service.ChessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author psl
 * @date 2019/6/1
 */
@Slf4j
@RestController
@RequestMapping("/chess")
public class ChessController {
    @Autowired
    private ChessService chessService;
    //得到对方的棋子的位置
    @RequestMapping("/getPlace.do")
    public String getChessPlace(HttpSession session,Integer rid){
        User user = (User) session.getAttribute("user");
        List<Chess> place = chessService.getPlace(user.getId(), rid);
        return JSON.toJSONString(place);
    }
    //保存棋子的位置
    @RequestMapping("/savePlace.do")
    public String saveChessPlace(Chess chess,HttpSession session,Integer rid){
        User user = (User) session.getAttribute("user");
        int flag = chessService.saveChessPlace(chess, user.getId(),rid);
        if (flag == 1){
            log.info("保存成功");
            return "保存成功";
        }else if (flag == -1){
             log.info("你已经下了棋，请不要重复点击");
            return "你已经下了棋，请不要重复点击";
        }else{
            log.info("未知错误");
            return "未知错误";
        }
    }
    //双方轮流下棋
    @RequestMapping("/changePerson.do")
    public String changePerson(HttpSession session){
        User user = (User) session.getAttribute("user");
        boolean flag = chessService.checkStatus(user.getId());
        if (flag){
            log.info("交换落子");
            return "交换落子";
        }else {
            log.info("该你落子");
            return "该你落子";
        }
    }

}
