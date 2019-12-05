<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/28
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>查询失败</title>
</head>
<body>
<h3>查询失败,您查询的订单不存在！</h3>
<h4>请点击返回重新查询</h4>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging" role="button">返回</a>
</body>
</html>
