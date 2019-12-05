<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确认订单信息</title>
</head>
<%--BootStrap美化界面--%>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>完善您的订单信息</small>
                </h1>
                <h1>
                    <big>购书满200享八折优惠！</big>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/order/deliverOrder" method="post">
        <input type="hidden" name="id_buyer" value="${shoppingcarts.getId_buyer()}">
        商家编号：<input type="text" name="id_seller" value="${shoppingcarts.getId_seller()}" readonly><br><br><br>
        书籍名称：<input type="text" name="name_book" value="${shoppingcarts.getName_book()}" readonly><br><br><br>
        图书单价：<input type="text" name="price_book" value="${shoppingcarts.getPrice_book()}" readonly><br><br><br>
        书籍数量：<input type="number" name="sum_book" value="${shoppingcarts.getSum_book()}" required>
        <span style="color: #ff0000;font-weight: bold">${error}</span>
        <br><br><br>
        收货地址：<input type="text" name="address_buyer" required><br><br><br>
        <input type="submit" value="提交"/><br><br><br>
    </form>


</div>

</body>
</html>