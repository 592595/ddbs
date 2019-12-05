package com.syx.postgresql;



import com.pan.util.DataSourceUtil;
import com.syx.user.userinfo;

import java.sql.*;

/**
 * @author 史翼璇
 * @create 2019/11/1
 */
public class posqlone {
    public boolean isUser(userinfo userinfor) {
        boolean flag = false;
        Connection connection = null;
        Statement statement = null;
        try {
            String url = "jdbc:postgresql://202.207.12.213:6300/master23";//换成自己PostgreSQL数据库实例所在的ip地址，并设置自己的端口
            String user = "u_2_4_1_3";
            String password = "P4v20!";
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("是否成功连接pg数据库" + connection);
            String sql = "select * from u_2_4_1_3.denglu_three";
            statement = connection.createStatement();
            /**
             * 关于ResultSet的理解：Java程序中数据库查询结果的展现形式，或者说得到了一个结果集的表
             * 在文档的开始部分有详细的讲解该接口中应该注意的问题，请阅读JDK
             * */
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //取出列值
                String usn = resultSet.getString("user_three");
                String pas = resultSet.getString("pwd_three");
                String z="3";
                String y="1";
                System.out.println(usn+","+pas+z+y);
                if (userinfor.getUsername().equals(usn) && userinfor.getPassword().equals(pas) && userinfor.getZhandian().equals(z) &&
                        userinfor.getLeiyonghu().equals(y)) {
                    System.out.println("1成");
                    flag = true;
                    DataSourceUtil.setDataSource("datasource_postgresql_u_2_4_1_3");

                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(statement!=null){
                    statement.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } finally {
                try {
                    if(connection!=null){
                        connection.close();
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
