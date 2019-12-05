<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部订单</title>
    <%--BootStrap美化界面--%>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div>
            <h1>
                <small>您的订单</small><br><br>
            </h1>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>订单编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍单价</th>
                    <th>订单金额</th>
                    <th>下单时间</th>
                    <th>收货地址</th>
                    <th>选择</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="order" items="${requestScope.get('list2')}">
                    <tr>
                        <td>${order.getId_order()}</td>
                        <td>${order.getName_book()}</td>
                        <td>${order.getSum_book()}</td>
                        <td>${order.getPrice_book()}</td>
                        <td>${order.getPrice_order()}</td>
                        <td>${order.getTime_order()}</td>
                        <td>${order.getAddress_buyer()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/order/checkorder?id_order=${order.id_order}">撤销订单</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
