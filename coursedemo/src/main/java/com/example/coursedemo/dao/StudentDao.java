package com.example.coursedemo.dao;

import com.example.coursedemo.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Repository
@Mapper
public interface StudentDao {
    @Select("select * from student where id = #{id}")
    @Results(id = "kebiao",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "sname",column = "sname"),
            @Result(property = "scs",column = "id" ,many =
            @Many(select = "com.example.coursedemo.dao.ScDao.findById"))
    })
    Student findByStuID(Integer id);

    @Select("select * from course where sname = #{name}")
    @ResultMap("kebiao")
    Student findByName(String name);
}
