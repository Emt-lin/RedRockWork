package cn.demo1;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * v1.0
 * @author psl
 */
public class JdbcUtils {
    private static Properties props = null;

    //只在jdbcutils类被加载时被执行一次
        static {
            try {
                /**
             *1、加载配置文件
             * 2、加载驱动类
             * 3、使用DriverManager.getConnection()
             */
                InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("dbconfig.properties");
                props = new Properties();
                props.load(in);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //加载驱动类
            try {
                Class.forName(props.getProperty("driverClassName"));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        //获取连接
    public static Connection getConnection() throws SQLException{
        //得到Connection
        return DriverManager.getConnection(props.getProperty("url"),
                props.getProperty("username"),
                props.getProperty("password"));
    }


}
