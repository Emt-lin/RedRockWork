package team.redrock.messageBoard.dao.impl;

import team.redrock.messageBoard.been.User;

import java.sql.*;

/**
 * @author psl
 */
public class UserDao {

    //数据库连接的一些配置
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users?characterEncoding=utf-8&useSSL=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "123";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 得到数据库连接
     *
     * @return 数据库连接
     */
    private Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public User findByUsername(String username) {
        String sql = "selecte * from users where username=?";
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
             pstmt = con.prepareStatement(sql);
            pstmt.setString(1,username);
            User user = new User();
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()){
                return user;
            }
            user.setUsername(rs.getString(1));
            user.setPassword(rs.getString(2));
           return user;
        } catch (SQLException e) {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e1) {
               throw new RuntimeException(e1);
            }
            throw new RuntimeException(e);
        }
    }

    /**
     * 添加用户
     * @param form
     */
    public void add(User form) {
        String sql = "insert into users values(?,?)";
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,form.getUsername());
            pstmt.setString(2,form.getPassword());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close(ResultSet res, PreparedStatement pstmt, Connection con) {
        try {
            res.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
