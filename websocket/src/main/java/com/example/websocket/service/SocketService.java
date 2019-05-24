package com.example.websocket.service;

import com.alibaba.fastjson.JSON;
import com.example.websocket.dao.SocketDao;
import com.example.websocket.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author psl
 * @date 2019/5/23
 */
@Service
public class SocketService {
    @Autowired
    private SocketDao dao;

    public String findAll(){
        List<Message> all = dao.findAll();
        return JSON.toJSONString(all);
    }
    public boolean insert(Message message){
       return dao.insert(message);
    }
}
