package com.example.gobang.domain;

import lombok.Data;

/**
 * @author psl
 * @date 2019/6/1
 */
@Data
public class Room {
    private Integer id;
    private String rName;
    //创建者的ID
    private Integer uid;
    //要加入人的id
    private Integer jUid;
    public Room() {
    }

    public Room(String rName, Integer uid) {
        this.rName = rName;
        this.uid = uid;
    }
}
