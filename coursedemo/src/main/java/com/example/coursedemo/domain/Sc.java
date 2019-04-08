package com.example.coursedemo.domain;

import lombok.Data;

import java.util.List;

/**
 * @author psl
 * @date 2019/4/7
 */
@Data
public class Sc {
    private Integer sid;
    private Integer cid;
    private List<Kebiao> kebiaos;
}
