package team.redrock.messageBoard.service.impl;

import team.redrock.messageBoard.been.User;
import team.redrock.messageBoard.dao.impl.UserDao;

/**
 * @author psl
 */
public class UserService {
    private UserDao userDao = new UserDao();

    /**
     * 登录方法
     * @param user
     */
    public void login(User user) throws UserException {
        User _user = userDao.findByUsername(user.getUsername());
        if (_user == null) throw new UserException("你还没注册，请去注册账号");
        if (_user.getPassword() != user.getPassword()) throw new UserException("密码错误，请重新输入");
    }

    /**
     * 注册
     * @param form
     */
    public void regist(User form) throws UserException {
        User _user= userDao.findByUsername(form.getUsername());

        if (_user != null) throw new UserException("账号已经被注册");
        //添加用户
        userDao.add(form);
    }
}
