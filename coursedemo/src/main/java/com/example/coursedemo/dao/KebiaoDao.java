package com.example.coursedemo.dao;

import com.example.coursedemo.domain.Kebiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Mapper
@Repository
public interface KebiaoDao {
    /**
     * 查询课表
     * @param id
     * @return
     */
    @Select("select * from course where cid = #{id}")
    List<Kebiao>findById(Integer id);
}
