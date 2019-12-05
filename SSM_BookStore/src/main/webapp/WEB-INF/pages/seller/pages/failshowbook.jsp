<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/16
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>警告</title>
</head>图书编号为ISBN号
<body>
<div style="text-align:center">
<h1>图书已存在，请重新输入</h1>
<a class="btn btn-primary" href="${pageContext.request.contextPath}/bookInfoController/limitedBook" role="button">返回</a>
</div>
</body>
</html>
