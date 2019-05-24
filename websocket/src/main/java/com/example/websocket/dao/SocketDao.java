package com.example.websocket.dao;

import com.example.websocket.domain.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/5/23
 */
@Mapper
@Repository
public interface SocketDao {
    @Select("select * from message")
    List<Message> findAll();

    @Insert("insert into message values(#{name},#{msg},#{time})")
    boolean insert(Message message);
}
