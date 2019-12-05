package com.syx.oracle;


import com.pan.util.DataSourceUtil;
import com.syx.user.userinfo;

import java.sql.*;

/**
 * @author 史翼璇
 * @create 2019/11/2
 */
public class orcaleone {
    public static  boolean isUser(userinfo userinfor) throws ClassNotFoundException, SQLException {
        boolean flag=false;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet result = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("开始尝试连接数据库！");
            String url = "jdbc:oracle:thin:@202.207.12.213:6100:master21";
            String user = "u_2_4_1_1";
            String password = "Aa123+";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("连接成功！");
            String sql = "select * from u_2_4_1_1.denglu_one";
            pre = con.prepareStatement(sql);// 实例化预编译语句
            result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
            while (result.next()) {
                //取出列值
                String usn = result.getString("user_one");
                String pas = result.getString("pwd_one");
                String z = "1";
                String y = "1";
                System.out.println(usn + "," + pas + z + y);
                if (userinfor.getUsername().equals(usn) && userinfor.getPassword().equals(pas) && userinfor.getZhandian().equals(z) &&
                        userinfor.getLeiyonghu().equals(y)) {
                    System.out.println("3成");
                    flag = true;
                    DataSourceUtil.setDataSource("datasource_oracle_u_2_4_1_1");
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
                // 注意关闭的顺序，最后使用的最先关闭
                if (result != null)
                    result.close();
                if (pre != null)
                    pre.close();
                if (con != null)
                    con.close();
                System.out.println("数据库连接已关闭！");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return flag;
    }
}
