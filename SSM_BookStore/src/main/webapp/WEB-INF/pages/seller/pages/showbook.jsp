<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/16
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>显示书本</title>
</head>
<body>
<!--   <a href="ExamBookController/ExamBookById">点击查询</a>-->
<div style="text-align: center;">

    <h4><strong>图书信息添加成功</strong></h4>
</div>

<div class="container">
    <!--响应式表格-->
    <div class="table-responsive">
        <table class="table table-hover ">
            <tbody >
            <tr>
                <td style="text-align: right;">图书编号:</td>
                <td style="text-align: left;"> ${insertBook.book_id}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书名:</td>
                <td style="text-align: left;"> ${insertBook.book_name}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">作者:</td>
                <td style="text-align: left;"> ${insertBook.author}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书单价:</td>
                <td style="text-align: left;"> ${insertBook.book_price}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">出版社:</td>
                <td style="text-align: left;"> ${insertBook.publishing_house}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书类型:</td>
                <td style="text-align: left;"> ${insertBook.book_type}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">出版时间:</td>
                <td style="text-align: left;"> <fmt:formatDate value="${insertBook.publishing_time}" pattern="yyyy-MM-dd"/></td>

            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">库存:</td>
                <td style="text-align: left;"> ${insertBook.inventory}</td>
            </tr>
            </tbody>

            <tbody >
            <tr>
                <td style="text-align: right;">
                </td>
                <td style="text-align: left;">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/bookInfoController/limitedBook" role="button">返回继续添加</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</html>
