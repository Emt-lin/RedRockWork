package com.example.coursedemo.domain;

import lombok.Data;

/**
 * @author psl
 * @date 2019/4/2
 */
@Data
public class Kebiao {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 课程名
     */
    private String cName;
    /**
     * 老师
     */
    private String teacher;
    /**
     * 状态
     */
    private String status;
    /**
     * 教学班
     */
    private String classNum;
    /**
     * 选/必修
     */
    private String type;
    private boolean state;
    private String place;
    private String week;
    private String day;
    private String lession;

}
