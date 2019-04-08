package com.example.coursedemo.service;

import com.example.coursedemo.dao.StudentDao;
import com.example.coursedemo.domain.Kebiao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    private Gson gson = new Gson();

    /**
     * 根据学号查课表
     * @param id
     * @return
     */
    public String findByStuID(Integer id){
        return gson.toJson(studentDao.findByStuID(id));
    }
    public String findByName(String name){
        return gson.toJson(studentDao.findByName(name));
    }
}
