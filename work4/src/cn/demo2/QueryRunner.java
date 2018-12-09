package cn.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author psl
 */
public class QueryRunner {
    private Connection con;

    public QueryRunner(Connection con) {
        this.con = con;
    }

    public QueryRunner() {
    }

    /**
     * 做增 、删 、改操作
     * @param sql
     * @param params
     * @return
     */
    public int update(String sql,Object...params){
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(sql);
            initParams(pstmt,params);//设置餐数
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if (pstmt != null) {
                    pstmt.close();
                }
                con.close();
            }catch (Exception e1){
                throw new RuntimeException(e1);
            }

        }

    }

    /**
     * 设置参数
     * @param pstmt
     * @param params
     * @throws SQLException
     */
    private void initParams(PreparedStatement pstmt,Object...params) throws SQLException {
        for (int i=0;i<params.length;i++){
            pstmt.setObject(i+1,params[i]);
        }
    }

    /**
     * 查询部分
     * @param sql
     * @param params
     * @return
     */
    public ResultSet query(String sql,Object...params){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            initParams(pstmt,params);
            rs = pstmt.executeQuery();
            return rs;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询全部
     * @param sql
     * @return
     */
    public ResultSet query(String sql){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            initParams(pstmt);
            rs = pstmt.executeQuery();
            return rs;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
