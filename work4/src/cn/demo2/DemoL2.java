package cn.demo2;

import cn.demo1.JdbcUtils;
import cn.demo2.domain.Dept;
import cn.demo2.domain.Goods;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 * @author psl
 */
public class DemoL2 {
    @Test
    public void fun1() throws SQLException {
        //增操作
//        Dept dept = new Dept(20,1000,"熟食",123,"aaa","零食");
//        insert(dept);
        //删除操作
        delete(10);
        //修改操作
//        update(10);
        //查询全部
//        select();
        //查询部分
//        select1(20);
        //商品的模糊查询
//        select2("零食");
        //商品的价格升序或者降序排序
//        sort();
    }

    /**
     * 插入
     * @param dept
     * @throws SQLException
     */
    public void insert(Dept dept) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "insert into dept values(?,?,?,?,?,?)";
        Object[] params = {dept.getDeptno(),dept.getFee(),dept.getDname(),dept.getPnumber(),
                dept.getAddress(),dept.getGname()};
        int i = qr.update(sql,params);
        System.out.println(i);
    }

    /**
     * 删除
     * @param deptno
     * @throws SQLException
     */
    public void delete(int deptno) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "delete from dept where deptno=?";
        Object[] params = {deptno};
        int i =qr.update(sql,params);
        System.out.println(i);
    }

    /**
     * 修改
     * @param deptno
     * @throws SQLException
     */
    public void update(int deptno) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "update dept set fee=? where deptno=?";
        Object[] params = {2000,deptno};
        int i = qr.update(sql,params);
        System.out.println(i);
    }
    //查询全部
   public void select()  {
       Connection con = null;
       ResultSet rs = null;
       try {
           con = JdbcUtils.getConnection();
           QueryRunner qr = new QueryRunner(con);
           String sql = "select * from dept";
           rs = qr.query(sql);
           if (!rs.next()) {
               System.out.println("表为空");
               return;
           }
           int count = rs.getMetaData().getColumnCount();//获得由多少列项
           while (rs.next()) {
               for (int i = 1; i < count; i++) {
                   System.out.print(rs.getObject(i));
                   if (i < count) {
                       System.out.print(", ");
                   }
               }
               System.out.println();
           }
       }catch (Exception e){
           throw new RuntimeException(e);
       }finally {
           try {
               if (rs != null) {
                   rs.close();
               }
               if (con != null) {
                   con.close();
               }
           } catch (SQLException e1) {
               throw new RuntimeException(e1);
           }

       }
   }

    /**
     * 查询部分
     * @param deptno
     * @throws SQLException
     */
    public void select1(int deptno) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "select * from dept where deptno=?";
        Object[] params = {deptno};
        ResultSet rs = qr.query(sql, params);
        if (!rs.next()){
            System.out.println("没查到");
            return;
        }
        rs.beforeFirst();
        List<Dept> list = new ArrayList<>();
        while (rs.next()){
            Dept dept = new Dept();
            dept.setDeptno(rs.getInt("deptno"));
            dept.setFee(rs.getInt("fee"));
            dept.setDname(rs.getString("dname"));
            dept.setPnumber(rs.getInt("pnumber"));
            dept.setAddress(rs.getString("address"));
            dept.setGname(rs.getString("gname"));
            list.add(dept);
        }
        System.out.println(list);
    }

    /**
     * 商品的模糊查询
     * @param gname
     * @throws SQLException
     */
    public void select2(String gname) throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "select * from goods where gname like ?";
        Object[] params = {"%"+gname+"%"};
        ResultSet rs = qr.query(sql,params);
        if (!rs.next()){
            System.out.println("没查到");
            return;
        }
        rs.beforeFirst();
        List<Goods> list = new ArrayList<>();
        while (rs.next()){
            Goods goods = new Goods();
            goods.setGnumber(rs.getInt("gnumber"));
            goods.setGname(rs.getString("gname"));
            goods.setCost(rs.getInt("cost"));
            goods.setPrice(rs.getInt("price"));
            goods.setDeptno(rs.getInt("deptno"));
            goods.setSname(rs.getString("sname"));
            list.add(goods);
        }
        System.out.println(list);
    }

    /**
     * 商品的价格升序或者降序排序
     * @throws SQLException
     */
    public void sort() throws SQLException {
        Connection con = JdbcUtils.getConnection();
        QueryRunner qr = new QueryRunner(con);
        String sql = "select * from goods order by ? ASC";//升序排序
//        String sql = "select * from goods order by ? DESC";//降序排序
        Object[] params = {"price"};
        ResultSet rs = qr.query(sql,params);
        List<Goods> list = new ArrayList<>();
        while (rs.next()){
            Goods goods = new Goods();
            goods.setGnumber(rs.getInt("gnumber"));
            goods.setGname(rs.getString("gname"));
            goods.setCost(rs.getInt("cost"));
            goods.setPrice(rs.getInt("price"));
            goods.setDeptno(rs.getInt("deptno"));
            goods.setSname(rs.getString("sname"));
            list.add(goods);
        }
        System.out.println(list);
    }
}
