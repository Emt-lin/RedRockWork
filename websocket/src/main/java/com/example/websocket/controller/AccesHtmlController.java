package com.example.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author psl
 * @date 2019/5/26
 */
@Controller
public class AccesHtmlController {
    @RequestMapping("/index")
    public String index(){
        return "/index.html";
    }
}
