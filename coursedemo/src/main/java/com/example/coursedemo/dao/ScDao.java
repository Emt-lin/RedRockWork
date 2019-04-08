package com.example.coursedemo.dao;

import com.example.coursedemo.domain.Sc;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Mapper
@Repository
public interface ScDao {
    /**
     * 查询课表
     * @param id
     * @return
     */
    @Select("select * from sc where sid = #{id}")
    @Results(value = {
            @Result(id = true,column = "sid",property = "sid"),
            @Result(property = "kebiaos",column = "cid",many = @Many(
                    select = "com.example.coursedemo.dao.KebiaoDao.findById"
            ))
    })
    List<Sc> findById(Integer id);
}
