package com.example.pachong.mybatis.dao;

import com.example.pachong.mybatis.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author psl
 * @date 2019/4/5
 */

@Mapper
@Repository
public interface StuDao {
    /**
     * 插入学生记录
     * @param stu
     */
    @Insert("insert into student values (#{id},#{sname})")
    boolean insert(Student stu);

    /**
     *
     * @param stu
     */
    @Update("update student set sname=#{sname} where id=#{id}")
    boolean update(Student stu);
}
