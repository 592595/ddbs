<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/27
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
      crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <!--响应式表格-->
    <div class="table-responsive">
        <table class="table table-hover ">
            <tbody >
            <tr>
                <td style="text-align: right;">订单编号:</td>
                <td style="text-align: left;"> ${OrderById.order_id}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">买家编号:</td>
                <td style="text-align: left;"> ${OrderById.buyer_id}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">卖家编号:</td>
                <td style="text-align: left;"> ${OrderById.seller_id}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书名:</td>
                <td style="text-align: left;"> ${OrderById.book_name}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书数量:</td>
                <td style="text-align: left;"> ${OrderById.book_count}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">图书单价:</td>
                <td style="text-align: left;"> ${OrderById.book_price}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">下单时间:</td>
                <td style="text-align: left;">${OrderById.ordered_time}</td>

            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">订单价格:</td>
                <td style="text-align: left;"> ${OrderById.order_sum}</td>
            </tr>
            </tbody>
            <tbody >
            <tr>
                <td style="text-align: right;">买家地址:</td>
                <td style="text-align: left;"> ${OrderById.buyer_address}</td>
            </tr>
            </tbody>

            <tbody >
            <tr>
                <td style="text-align: right;">
                </td>
                <td style="text-align: left;">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging" role="button">返回</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
