<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2019/11/2
  Time: 下午1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>g2组网上书城</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
    <div class="logo margin-big-left fadein-top">
        <h1><img src="images/tushu.jpg.jpg" class="radius-circle rotate-hover" height="50" alt="" />g2组网上书城</h1>
    </div>
    <div class="head-l"><a class="button button-little bg-green" href="denglu.jsp" target="_blank"><span class="icon-home"></span>退出到登录页面3</a> &nbsp;</div>
</div>
<div class="leftnav">
    <div class="leftnav-title"><strong><span class="icon-list" style="font-size:x-large"></span>菜单列表</strong></div>
    <h2><span class="icon-pencil-square-o" style="font-size:x-large"></span>管理员业务</h2>
    <ul>
        <li><a href="/public/selectAllBuyer" target="right">查看买家信息</a></li>
        <li><a href="/public/showBookSum" target="right">统计图书信息</a></li>
        <li><a href="/public/BookUnder" target="right">下架违规图书</a></li>
    </ul>
    <h2><span class="icon-pencil-square-o"style="font-size:x-large"></span>买家业务</h2>
    <ul>
        <li><a href="${pageContext.request.contextPath}/jump/index" target="right">加入购物车</a></li>
        <li><a href="${pageContext.request.contextPath}/jump/index" target="right">提交订单</a></li>
        <li><a href="${pageContext.request.contextPath}/jump/index" target="right">撤销订单</a></li>
    </ul>
    <h2><span class="icon-pencil-square-o" style="font-size:x-large"></span>卖家业务</h2>
    <ul>
        <li><a href="${pageContext.request.contextPath}/test/index" target="right">查看库存</a></li>
        <li><a href="${pageContext.request.contextPath}/test/index" target="right">上架图书</a></li>
        <li><a href="${pageContext.request.contextPath}/test/index" target="right">查看订单</a></li>
    </ul>
</div>
<script type="text/javascript">
    $(function(){
        $(".leftnav h2").click(function(){
            $(this).next().slideToggle(200);
            $(this).toggleClass("on");
        })
        $(".leftnav ul li a").click(function(){
            $("#a_leader_txt").text($(this).text());
            $(".leftnav ul li a").removeClass("on");
            $(this).addClass("on");
        })
    });
</script>
<ul class="bread">
    <li><a target="right" class="icon-home"> 首页</a> <img src="image/tupian2.jpg"></li>
</ul>

</body>
</html>