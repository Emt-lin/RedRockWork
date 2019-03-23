package com.example.demowork.dao;


import com.example.demowork.moddle.User;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author psl
 * @date 2019/3/21
 */
@Repository
public class TestDao{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://";
    private static final String USER = "root";
    private static final String PWD = "123";

    //static 加载这个类的时候加载数据库连接的驱动
    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, USER, PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * 进行权限验证
     * @param form
     * @return
     */
    public boolean findPermission(User form){
        String sql = "select * from permisssion where pid=" +
                "(select p_id from role_permission where r_id=" +
                "(select r_id from user_role where u_id=" +
                "(select uid from user where username=?)))";
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
             pstmt = con.prepareStatement(sql);
             pstmt.setString(1,form.getUsername());
             rs = pstmt.executeQuery();
            List<String> list = new ArrayList<>();
            while (rs.next()){
                String s = rs.getString(1);
                list.add(s);
            }
            for (String s:list
                 ) {
                if (s.contains("delete")){
                    return false;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public void delete(User form) {
    }
}
