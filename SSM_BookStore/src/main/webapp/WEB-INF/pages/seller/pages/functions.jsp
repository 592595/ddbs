<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/2
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网上书城</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
    <div class="logo margin-big-left fadein-top">
        <h1><img src="${pageContext.request.contextPath}/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />网上书城</h1>
    </div>



</div>

<div class="leftnav">
    <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2><span class="icon-user"></span>卖家功能</h2>
    <ul style="display:block">
        <li><a  href="${pageContext.request.contextPath}/functions/inventory" target="right_czg"  ><span class="icon-caret-right"></span>查看库存</a></li>
        <li><a href="${pageContext.request.contextPath}/bookInfoController/limitedBook" target="right_czg"><span class="icon-caret-right"></span>上架图书</a></li>
        <li><a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging" target="right_czg"><span class="icon-caret-right"></span>查看订单</a></li>
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
    <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
    <li><a href="##" id="a_leader_txt">网站信息</a></li>
</ul>

<div class="admin">
    <iframe scrolling="auto" rameborder="0" src="${pageContext.request.contextPath}/functions/inventory" name="right_czg" width="100%" height="100%" />
</div>

</body>
</html>