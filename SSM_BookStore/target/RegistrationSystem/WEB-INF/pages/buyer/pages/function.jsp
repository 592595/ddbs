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
    <h2><span class="icon-user"></span>买家功能</h2>
    <ul style="display:block">
        <li><a href="${pageContext.request.contextPath}/book/allBook" target="right_qhz"  ><span class="icon-caret-right"></span>加入购物车</a></li>
        <li><a href="${pageContext.request.contextPath}/order/allShoppingcarts" target="right_qhz"><span class="icon-caret-right"></span>提交订单</a></li>
        <li><a href="${pageContext.request.contextPath}/order/showOrders" target="right_qhz"><span class="icon-caret-right"></span>撤销订单</a></li>
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
    <iframe scrolling="auto" rameborder="0" src="${pageContext.request.contextPath}/book/allBook" name="right_qhz" width="100%" height="100%" />
</div>

</body>
</html>
