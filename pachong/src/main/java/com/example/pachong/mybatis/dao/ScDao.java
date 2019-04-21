package com.example.pachong.mybatis.dao;

import com.example.pachong.mybatis.domain.Sc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author psl
 * @date 2019/4/7
 */

@Mapper
@Repository
public interface ScDao {
    @Insert("insert into sc(sid,cid,classNum) values (#{sid},#{cid},#{classNum})")
    boolean insert(Sc sc);
}
