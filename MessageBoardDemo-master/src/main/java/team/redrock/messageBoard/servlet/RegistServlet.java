package team.redrock.messageBoard.servlet;

import team.redrock.messageBoard.been.User;
import team.redrock.messageBoard.service.impl.UserException;
import team.redrock.messageBoard.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistServlet",urlPatterns = "/regist")
public class RegistServlet extends HttpServlet {
    private UserService userService = new UserService();
    /**
     *
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        try {
            userService.regist(user);
            //去登录界面
            request.getRequestDispatcher("/login.jsp");
        } catch (UserException e) {
            request.setAttribute("msg",e.getMessage());
            //回显数据
            request.setAttribute("user",user);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
