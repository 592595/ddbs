package com.syx.orcalethree;



import com.pan.util.DataSourceUtil;
import com.syx.user.userinfo;

import java.sql.*;

/**
 * @author 史翼璇
 * @create 2019/11/2
 */
public class oraclethree {
    public static  boolean isUser(userinfo userinfor) throws ClassNotFoundException, SQLException {
        boolean flag=false;
        Connection con = null;// 创建一个数据库连接
        PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
        ResultSet result = null;// 创建一个结果集对象
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
            System.out.println("开始尝试连接数据库！");
            String url = "jdbc:oracle:thin:@202.207.12.213:6100:master21";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
            String user = "u_2_4_3_1";// 用户名,系统默认的账户名
            String password = "N6t48/";// 你安装时选设置的密码
            con = DriverManager.getConnection(url, user, password);// 获取连接
            System.out.println("连接成功！");
            String sql = "select * from u_2_4_3_1.denglu_one";
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
                    DataSourceUtil.setDataSource("datasource_oracle_u_2_4_3_1");
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
