<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019/11/2
  Time: 下午1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>欢迎来到登录界面</title>
</head>
<body style="background-color:honeydew">
<header >
    <div style="color: black;padding-top: 8px;padding-bottom: 5px;font-family: fantasy;font-size: xx-large;text-align: center ">
        网上书城
    </div>
    <div style="text-align: right;padding-top: 3px;padding-bottom: 2px">
        欢迎！
    </div>
</header>
<a style="position: absolute;left: 0;top: 100px;width: 100%;height: 560px;overflow: hidden;">
    <img src="image/tupian.jpg" width="1450" height="650" border="0">
</a>
<div style="width: 1450px;height: 500px;margin: 0 auto; ">
    <div  style="width: 100%; color: #676767;font-size: 14px;float: left;display: inline;zoom: 1; background-position: 55px 20px;">
        <div style="float: right; width: 340px;height: 520px;margin: 20px 0 0 0;padding: 0 30px;display: inline; position: relative; font-family: 'Microsoft Yahei'; background: #fff; ">
            <div style="width: 340px;height: 80px;line-height: 80px;text-align: center;font-size: 22px;font-weight: bold;font-family: 'Microsoft Yahei';color: #333;">
                账号登录
            </div>
            <div >
                <div >
                    <p style="color: red;padding:5px 5px 5px 0;line-height: 18px;"></p>
                    <div >
                        <form  name="loginform"  action="demo3" method="post">
                            用户名： <input type="text" placeholder="请输入用户名"   name="username"/><br><br>
                            密&nbsp&nbsp&nbsp&nbsp码：<input type="password" placeholder="请输入密码" name="password" /><br><br>
                            数据库站点：<select name="zhandian">
                            <option value="0">--请选择--</option>
                            <option value="1">站点1</option>
                            <option value="2">站点2</option>
                            <option value="3">站点3</option>
                        </select><br><br>
                            &nbsp;&nbsp;&nbsp;用户类别：<select name="leiyonghu">
                            <option value="0">--请选择--</option>
                            <option value="1">第四类用户</option>
                            <option value="2">第一类用户</option>
                            <option value="3">第三类用户</option>
                        </select><br><br>
                            <p>
                                <input type="submit" name="tijiao"  value="登录"  style=" width: 338px;height: 50px; background: cornflowerblue; border: none; font-family: 'Microsoft Yahei';cursor: pointer;margin: 0 0 15px 0;font-size: 18px; font-weight: bold; color: #fff;"/>
                            </p>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>