package com.example.gobang.domain;

import lombok.Data;

/**
 * @author psl
 * @date 2019/5/31
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private boolean r_status;

    public User() {
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
