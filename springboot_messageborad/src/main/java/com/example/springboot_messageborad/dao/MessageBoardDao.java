package com.example.springboot_messageborad.dao;

import com.example.springboot_messageborad.domain.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author psl
 * @date 2019/3/29
 */
@Mapper
public interface MessageBoardDao {
    /**
     * 查询所有留言
     * @param id
     * @return
     */
    @Select("select * from message where id=#{id}")
    List<Message> findByPid(Integer id);

    /**
     * 插入留言
     * @param message
     * @return
     */
    @Insert("insert into message set pid=#{pid},username=#{username},text=#{text}")
    boolean insertMessage(Message message);
}
