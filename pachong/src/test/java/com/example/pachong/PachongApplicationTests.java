package com.example.pachong;

import com.example.pachong.mybatis.dao.ScDao;
import com.example.pachong.mybatis.dao.StuDao;
import com.example.pachong.mybatis.domain.Student;
import com.example.pachong.mybatis.service.GetData;
import com.example.pachong.mybatis.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PachongApplicationTests {
    @Autowired
    private Service service;

    @Test
    public void contextLoads() {
        //215001-215198
//        test(2017210001,2017210999);
//        test(2017211001,2017211999);
//        test(2017212001,2017212999);
//        test(2017213001,2017213999);
//        test(2017214001,2017214999);
//        test(2017215001,2017215199);



    }
    public void test(Integer start,Integer end){
        for(int i = start;i<=end;i++){
            try {
//                service.insert(i);
                service.inUser(i);
            }catch (Exception e){
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(new File("student.txt"),true));
                    writer.write(i+"");
                    writer.newLine();
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

        }
//        System.out.println(GetData.getUser(2017210001));
    }


}
