package com.example.gobang.dao;

import com.example.gobang.domain.Room;
import com.example.gobang.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/5/31
 */
@Repository
@Mapper
public interface UserDao {
    @Insert("insert into user (name,password) values(#{name},#{password})")
    boolean insert(User user);

    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Select("select * from room where rName = #{rName}")
    Room findByRname(String rName);

    @Insert("insert into room (rName,uid) values(#{rName},#{#{uid})")
    boolean createRoom(Room room);

    @Update("update room set juid = #{jUid} where roomName=#{roomName}")
    int joinRoom(Integer jUid,String roomName);

    @Update("update user set r_status = #{status} where id = #{id}")
    boolean changeStatus(@Param("id") Integer id,@Param("status") boolean status);

    @Select("select * from user where id in (#{uid},#{jUid})")
    List<User> checkStatus(Room room);
}
