package com.example.pachong.mybatis.dao;

import com.example.pachong.mybatis.domain.Kebiao;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/3
 */

@Mapper
@Repository
public interface KebiaoDao {
    /**
     * 插入课程表信息
     * @param kebiaos
     * @return
     */
    @Insert({
            "<script>",
            "insert into course(cname,teacher,status,type,state,place,week,day,lession,classNum)",
            "values",
            "<foreach collection='kebiaos' item='item' separator=',' index='key'>",
            "(#{item.cname},#{item.teacher},#{item.status},#{item.type},#{item.state},#{item.place},#{item.week},#{item.day},#{item.lession},#{item.classNum})",
            "</foreach>",
            "</script>"
    })
    @Options(useGeneratedKeys = true,keyProperty = "cid",keyColumn = "cid")
    boolean insert(@Param(value = "kebiaos") List<Kebiao> kebiaos);

    /**
     * 根据课程号查询
     * @param classNum
     * @return
     */
    @Select("select classNum from course where classNum = #{classNum}")
    String findByClassNum(String classNum);

}
