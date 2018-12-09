package cn.demo1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author psl
 */
public class DemoL1 {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcUtils.getConnection();
//        add(con);//增加
        //change(con);//修改操作
//        delete(con);//删除
        find(con);//查询操作（包括模糊）
    }
    //增加操作
    public static void add(Connection con) throws SQLException {
        String sql = "INSERT INTO stu values (?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,30);
        pstmt.setString(2,"小明");
        pstmt.setInt(3,20);
        pstmt.setString(4,"男");
        pstmt.setString(5,"重庆");
        pstmt.setInt(6,3000);
        pstmt.executeUpdate();
    }
    //删除操作
    public static void delete(Connection con) throws SQLException {
        String sql = "delete from stu WHERE age=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,20);
        pstmt.executeUpdate();
    }
    //修改操作
    public static void change(Connection con) throws SQLException {
        String sql = "UPDATE stu SET sname=? where sname=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(2,"王小明");
        pstmt.setString(1,"张三");
        pstmt.executeUpdate();
    }
    //查询操作(包括模糊查询)
    public static void find(Connection con)  {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            //模糊查询
            String sql = "SELECT * from stu where sname LIKE ?";
            //查询全部
//            String sql = "select * from  stu";
             pstmt = con.prepareStatement(sql);
             pstmt.setString(1,"%王%");
             rs = pstmt.executeQuery();

            int count = rs.getMetaData().getColumnCount();//获得由多少列项
            while (rs.next()){
                for (int i=1;i<=count;i++){
                    System.out.print(rs.getString(i));
                    if (i<count){
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            try {
                if(rs!=null) rs.close();
                if(pstmt!=null) pstmt.close();
                if (con!=null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
