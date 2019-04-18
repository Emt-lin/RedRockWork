package com.example.coursedemo.controller;

import com.example.coursedemo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 根据学号查课表
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById",produces = "application/json")
    public String findById(String id){

        String kebiaos = studentService.findByStuID(Integer.parseInt(id));
        if (kebiaos != null){
            return kebiaos;
        }else {
            return "没有该学号的课表";
        }
    }
    @RequestMapping(value = "/findByName",produces = "application/json")
    public String findByName(String name){
        String kebiaos = studentService.findByName(name);
        if (kebiaos != null){
            return kebiaos;
        }else {
            return "没有该学号的课表";
        }
    }
}
