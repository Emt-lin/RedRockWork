package com.example.demowork.controller;

import com.example.demowork.annotion.Cache;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author psl
 * @date 2019/3/22
 */
@RestController
public class TestCacheController {
    @Cache
    @RequestMapping("/welcome")
    public String welcome(){

        return "";
    }
}
