<%@ page import="java.awt.print.Book" %>
<%@ page import="com.pan.model.Books" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--BootStrap美化界面--%>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div>
            <h1>
                <small> 书籍库存————显示所有书籍</small>
            </h1>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <%--toAddBook--%>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">显示全部书籍</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                <%--查询书籍--%>
                <form action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" name="queryBookName" placeholder="请输入要查询的书籍名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍名称</th>
                    <th>商家编号</th>
                    <th>书籍库存</th>
                    <th>书籍单价</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--书籍从数据库中查询出来，从list中遍历出来：foreach--%>
                <tbody>
                <c:forEach var="book" items="${requestScope.get('list')}">
                    <tr>
                        <td>${book.getName_book()}</td>
                        <td>${book.getId_seller()}</td>
                        <td>${book.getInv_book()}</td>
                        <td>${book.getPrice_book()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdate?BookName=${book.name_book}">加入购物车</a>
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
