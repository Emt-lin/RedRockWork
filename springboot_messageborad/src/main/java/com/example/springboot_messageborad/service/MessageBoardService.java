package com.example.springboot_messageborad.service;

import com.example.springboot_messageborad.dao.MessageBoardDao;
import com.example.springboot_messageborad.domain.Message;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author psl
 * @date 2019/3/29
 */
@Service
public class MessageBoardService {
    @Autowired
    private MessageBoardDao messageBoardDao;

    /**
     * 查询所有的留言
     * @return
     */
    public String findAllMessages(){
        Gson gson = new Gson();
        List<Message> messages = messageBoardDao.findByPid(0);
        for (Message message:messages
             ) {
            List<Message> childList =findMessageChild(message);
            message.setChildContent(childList);
        }
        return gson.toJson(messages);
    }

    /**
     * 查找每条留言的子节点
     * @param message
     * @return
     */
    private List<Message> findMessageChild(Message message) {
        List<Message> messageList = messageBoardDao.findByPid(message.getId());
        for (Message m:messageList
             ) {
            //递归找这条留言的节点 然后赋值
            List<Message> child = findMessageChild(m);
            m.setChildContent(child);
        }
        return messageList;
    }

    public boolean insertMessage(Message message) {
       boolean flag =  messageBoardDao.insertMessage(message);
       return flag;
    }
}
