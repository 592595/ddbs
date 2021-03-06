<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>当前购物车展示</title>
    <%--BootStrap美化界面--%>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div>
            <h1>
                <small> 购物车————显示所有车中预购书籍</small>
            </h1>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍名称</th>
                    <th>商家编号</th>
                    <th>书籍数量</th>
                    <th>书籍单价</th>
                </tr>
                </thead>
                <%--书籍从数据库中查询出来，从list中遍历出来：foreach--%>
                <tbody>
                <c:forEach var="shoppingcart" items="${requestScope.get('list')}">
                    <tr>
                        <td>${shoppingcart.getName_book()}</td>
                        <td>${shoppingcart.getId_seller()}</td>
                        <td>${shoppingcart.getSum_book()}</td>
                        <td>${shoppingcart.getPrice_book()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>

</body>
</html>
