package com.syx.sqlser;


import com.pan.util.DataSourceUtil;
import com.syx.user.userinfo;

import java.sql.*;

/**
 * @author 史翼璇
 * @create 2019/11/1
 */
public class sqltestone {
    public static boolean isUser(userinfo userinfor) throws ClassNotFoundException {
        boolean flag = false;
        Connection conn=null;
        Statement stmt=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try {
            ResultSet rs;
            String url = "jdbc:sqlserver://202.207.12.213:6200;DatabaseName=master22;";
            String sql = "select * from  u_2_4_1_2.denglu_two";
            // 连接数据库
            conn = DriverManager.getConnection(url, "u_2_4_1_2", "S9s49-");
            // 建立Statement对象
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //取出列值
                String usn = rs.getString("user_two");
                String pas = rs.getString("pwd_two");
                String z = "2";
                String y = "1";
                System.out.println(usn + "," + pas + z + y);
                if (userinfor.getUsername().equals(usn) && userinfor.getPassword().equals(pas) && userinfor.getZhandian().equals(z) &&
                        userinfor.getLeiyonghu().equals(y)) {
                    System.out.println("1成");
                    flag = true;
                    DataSourceUtil.setDataSource("datasource_sqlserver_u_2_4_1_2");
                }
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } finally {
                try {
                    if(conn!=null){
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }
}

