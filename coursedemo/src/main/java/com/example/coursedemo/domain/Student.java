package com.example.coursedemo.domain;

import lombok.Data;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Data
public class Student {
    private Integer id;
    private String sname;
    private List<Sc> scs;
}
