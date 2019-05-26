package com.example.websocket.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.websocket.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author psl
 * @date 2019/5/24
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.println("拦截器 >>>" + user);
        if (user == null){
            response.setContentType("text/html;charset=utf-8");
            JSONObject msg = new JSONObject();
            msg.put("msg","你还没有登录，请去登录");
            response.getWriter().write(msg.toJSONString());
            return false;
        }else {
            System.out.println(user.getName() + "已经登录");
            request.setAttribute("user",user);
            return true;
        }

    }
}
