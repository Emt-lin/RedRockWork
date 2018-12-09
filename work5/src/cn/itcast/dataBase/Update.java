package cn.itcast.dataBase;

import cn.itcast.jdbc.TxQueryRunner;
import cn.itcast.student.StudentBean;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * 向数据库添加
 * @author psl
 */
public class Update {
     private static QueryRunner qr = new TxQueryRunner();
    public static void add(StudentBean s){
        try {
            String sql = "insert into t_stu values(?,?,?,?,?,?,?,?,?,?," +
                    "?,?,?,?,?,?,?,?,?)";
            for (StudentBean.ReturnDataBean r: s.getReturnData()
                 ) {
                Object[] params = {s.getCode(), s.getInfo(),r.getBj(),r.getCsrq(),r.getMz(),r.getNj(),r.getRxrq(),r.getXb(),
                r.getXh(),r.getXjzt(),r.getXm(),r.getXmEn(),r.getXz(),r.getYxh(),r.getYxm(),r.getYxmen(),r.getZyh(),
                r.getZym(),r.getZymEn()};
                qr.update(sql,params);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
