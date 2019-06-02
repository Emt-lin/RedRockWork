package com.example.gobang.service;

import com.example.gobang.dao.UserDao;
import com.example.gobang.domain.Room;
import com.example.gobang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author psl
 * @date 2019/5/31
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

    public boolean createRoom(Room room) {
        Room room1 =  userDao.findByRname(room.getRName());
        if (room1 != null){
            return false;
        }
        boolean flag = userDao.createRoom(room);
        return flag;
    }

    public Room searchRoom(String roomName) {
        Room room = userDao.findByRname(roomName);
        return room;
    }

    public int joinRoom(User user,String roomName) {
        Room room = userDao.findByRname(roomName);
        if (room.getJUid() != null){
            return 0;
        }else{
            return userDao.joinRoom(user.getId(),roomName);
        }
    }

    public boolean changeStatus(Integer id,boolean status) {
        boolean flag = userDao.changeStatus(id, status);

        return flag;
    }

    public boolean checkStatus(Room room) {
        List<User> users = userDao.checkStatus(room);
        if (users.get(0).isR_status() && users.get(1).isR_status()){
            return true;
        }else {
            return false;
        }
    }
}
