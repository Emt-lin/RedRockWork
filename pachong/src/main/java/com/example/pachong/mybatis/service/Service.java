package com.example.pachong.mybatis.service;

import com.example.pachong.mybatis.dao.KebiaoDao;
import com.example.pachong.mybatis.dao.ScDao;
import com.example.pachong.mybatis.dao.StuDao;
import com.example.pachong.mybatis.domain.Kebiao;
import com.example.pachong.mybatis.domain.Sc;
import com.example.pachong.mybatis.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/5
 */
@Component
public class Service implements Runnable{
    private static final Integer BEGIN = 2017211990;
    private static final Integer END = 2017211999;

    @Autowired
    private KebiaoDao dao;
    @Autowired
    private ScDao scDao;
    @Autowired
    private StuDao stuDao;

    @Transactional(rollbackFor = Exception.class)
    public  void insert(Integer urlId){


            List<Kebiao> kebiaos = GetData.getTime(urlId);
            if (kebiaos == null){
                return;
            }
            dao.insert(kebiaos);

            Student s = GetData.getUser(urlId);
            stuDao.insert(s);



            for (Kebiao k:kebiaos
                 ) {
                Sc sc = new Sc();
                sc.setSid(s.getId());
                sc.setCid(k.getCid());
                sc.setClassNum(k.getClassNum());
                scDao.insert(sc);
            }
    }
    @Transactional(rollbackFor = Exception.class)
    public void inUser(Integer urlId){
        Student s = GetData.getUser(urlId);

        stuDao.update(s);
    }

    @Override
    public void run() {

    }
}
