package com.example.demowork.service;

import com.example.demowork.dao.TestDao;
import com.example.demowork.moddle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author psl
 * @date 2019/3/21
 */
@Service
public class TestService {
    @Autowired
    private TestDao dao;

    public String delete(User user){
        dao.delete(user);
        return "删除成功";
    }
}
