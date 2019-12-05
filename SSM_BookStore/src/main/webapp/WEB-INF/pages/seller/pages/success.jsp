
<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/10/29
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>查询结果</title>
</head>
<body>
     <!--   <a href="ExamBookController/ExamBookById">点击查询</a>-->

     <div class="container">
         <!--响应式表格-->
         <div class="table-responsive">
             <table class="table table-hover">
                 <thead>
                 <tr>
                     <th>图书编号</th>
                     <th>图书名字</th>
                     <th>图书库存</th>
                 </tr>
                 </thead>
                 <tbody>
                         <td>${bookById.book_id}</td>
                         <td>${bookById.book_name}</td>
                         <td> ${bookById.inventory}</td>
                     </tr>
                 </tbody>
             </table>
         </div>
     </div>
                <!--提示跳转框-->
                <div class="alert alert-success" style="text-align:center;">
                    <strong>查询成功!</strong> 查询详细库存 <a href="${pageContext.request.contextPath}/examBookController/examBookInventoryById?book_id=${bookById.book_id}" class="alert-link">请点击这里</a>。
                </div>

</body>
</html>
