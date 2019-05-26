package com.example.websocket.service;

import com.alibaba.fastjson.JSON;
import com.example.websocket.dao.UserDao;
import com.example.websocket.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author psl
 * @date 2019/5/26
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean save(User user){
        User user1 = userDao.findByName(user.getName());
        if (user1 != null){
            return false;
        }
        return userDao.insert(user);
    }

    /**
     * 登录
     * @param user
     * @return
     */
    public boolean login(User user, HttpSession session){
        User user1 = userDao.findByName(user.getName());
        if (user1 != null && user1.getPassword().equals(user.getPassword())){
            session.setAttribute("user",user1);
            return true;
        }
        return false;
    }
    //查询所有的用户
    public String findAll(){
        List<User> users = userDao.findAll();
        return JSON.toJSONString(users);
    }
    //添加朋友
    public boolean addFriend(Integer id,String fName){
        User user = userDao.findByName(fName);
        boolean flag = userDao.addFriend(id, user.getId());
        return flag;
    }
}
