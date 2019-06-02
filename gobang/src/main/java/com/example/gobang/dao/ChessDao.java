package com.example.gobang.dao;

import com.example.gobang.domain.Chess;
import com.example.gobang.domain.Room;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/6/2
 */
@Repository
@Mapper
public interface ChessDao {

    @Insert("insert into chessboard (x,y,color,uid,rid) values(#{x},#{y},#{color},#{uid},#{rid})")
    int savePlace(Chess chess, @Param("uid") Integer uid,@Param("rid") Integer rid);

    @Select("select u_status from user where id = #{id}")
    boolean checkStatus(Integer id);

    @Update("update user set u_status = #{status} where id=#{id}")
    void changeStatus(@Param("id") Integer id,@Param("status") boolean status);
    @Select("select * from room where id = #{rid}")
    Room search(Integer rid);

    @Select("select * from chessboard where uid=#{uid} and rid=#{rid}")
    List<Chess> findPlaceById(@Param("uid") Integer uid, @Param("rid") Integer rid);
}
