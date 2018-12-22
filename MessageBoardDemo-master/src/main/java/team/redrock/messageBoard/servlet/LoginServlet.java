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

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    /**
     * 登录
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        try {
            userService.login(user);
            request.getSession().setAttribute("user",user);
            //后面省略
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
    
}
