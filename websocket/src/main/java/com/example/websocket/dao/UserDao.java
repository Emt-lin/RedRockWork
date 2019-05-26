package com.example.websocket.dao;

import com.example.websocket.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/5/26
 */
@Mapper
@Repository
public interface UserDao {

    @Insert("insert into user (name,password) values(#{name},#{password})")
    boolean insert(User user);

    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Select("select * from user ")
    List<User> findAll();

    @Insert("insert into friend values (#{id},#{fid})")
    boolean addFriend(@Param("id") Integer id,@Param("fid") Integer fid);

    @Select("select * from friend where fid = #{fid}")
    boolean findById(Integer fid);
}
