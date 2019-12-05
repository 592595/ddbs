<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/1
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>库存详情</title>
</head>
<body>
<div class="container">
    <!--响应式表格-->
    <div class="table-responsive">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>图书编号</th>
                <th>图书名字</th>
                <th>图书库存</th>
                <th>已售数量</th>
                <th>总数量</th>
            </tr>
            </thead>
            <tbody>
            <td>${inventory.book_id}</td>
            <td>${inventory.book_name}</td>
            <td> ${inventory.inventory}</td>
            <td> ${inventory.selled_count}</td>
            <td> ${inventory.book_count_sum}</td>
            </tr>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>
