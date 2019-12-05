<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
    <title>订单查询</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/orderInfoController/selectOrderById" >
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> </div>
        <div class="padding border-bottom">
            <ul class="search" style="padding-left:50px;">
                <li>
                    <input type="text" placeholder="请输入订单编号" name="order_id" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <input type="submit" value="搜索" class="button border-main icon-search" />
                </li>
            </ul>
        </div>
    </div>
 </form>
<!--requestScope.-->
<c:if test="${!empty requestScope.pageMsg}">
    <table class="table table-hover text-center">
        <thead>
        <tr>
            <td>订单编号</td>
            <td>买家编号</td>
            <td>卖家编号</td>
            <td>图书名字</td>
            <td>图书数量</td>
            <td>图书单价</td>
            <td>下单时间</td>
            <td>订单价格</td>
            <td>买家地址</td>
        </tr>
        </thead>
        <c:forEach var="order" items="${pageMsg.lists}" >
            <tr>
                <th>${order.order_id}</th>
                <th>${order.buyer_id}</th>
                <th>${order.seller_id}</th>
                <th>${order.book_name}</th>
                <th>${order.book_count}</th>
                <th>${order.book_price}</th>
                <th>${order.ordered_time}</th>
                <th>${order.order_sum}</th>
                <th>${order.buyer_address}</th>
            </tr>
        </c:forEach>
    </table>
    <c:if test="${requestScope.pageMsg.totalCount>0}">
    <tr>
        <td colspan="15">

            <span>当前页数：${requestScope.pageMsg.currentPage } </span>
            <div class="pagelist">
            <c:if test="${requestScope.pageMsg.currentPage!= 1}">
           <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${requestScope.pageMsg.currentPage-1}">上一页</a>

       </c:if>
         <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=1">1</a>
                <!--小于6页直接打印-->
                <c:if test="${requestScope.pageMsg.totalPage < 7}">
                  <c:forEach var="i" begin="2" end="${requestScope.pageMsg.totalPage-1}">
                     <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${i}">${i}</a>
                  </c:forEach>
                </c:if>

                <c:if test="${requestScope.pageMsg.totalPage>6}">
                    <c:if test="${(requestScope.pageMsg.currentPage-3)>1}">
                        ...
                        <c:if test="${(requestScope.pageMsg.currentPage+3)<requestScope.pageMsg.totalPage}">
                        <c:forEach var="k" begin="${requestScope.pageMsg.currentPage-2}" end="${requestScope.pageMsg.currentPage+2}">
                        <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${k}">${k}</a>
                        </c:forEach>
                        </c:if>
                    </c:if>
                    <c:if test="${(requestScope.pageMsg.currentPage-3)<=1}">
                        <c:if test="${requestScope.pageMsg.currentPage<6}">
                        <c:forEach var="k" begin="2" end="6">
                            <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${k}">${k}</a>
                        </c:forEach>
                        </c:if>
                    </c:if>

                    <c:if test="${requestScope.pageMsg.currentPage+2<requestScope.pageMsg.totalPage-1}">
                        ...
                        </c:if>
                    <c:if test="${(requestScope.pageMsg.currentPage+3)==requestScope.pageMsg.totalPage
                    ||(requestScope.pageMsg.currentPage+1)==requestScope.pageMsg.totalPage
                    ||(requestScope.pageMsg.currentPage+2)==requestScope.pageMsg.totalPage}">
                        <c:forEach var="k" begin="${requestScope.pageMsg.currentPage-2}" end="${requestScope.pageMsg.totalPage-1}">
                            <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${k}">${k}</a>
                        </c:forEach>
                    </c:if>
                </c:if>

                <c:if test="${requestScope.pageMsg.currentPage+1<=requestScope.pageMsg.totalPage}">
                <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${requestScope.pageMsg.totalPage}">${requestScope.pageMsg.totalPage}</a>
                </c:if>

                  <c:if test="${requestScope.pageMsg.currentPage==requestScope.pageMsg.totalPage&&requestScope.pageMsg.totalPage>6}">
                  <c:forEach var="i" begin="${requestScope.pageMsg.totalPage-4}" end="${requestScope.pageMsg.totalPage}">
                      <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${i}">${i}</a>
                  </c:forEach>
                  </c:if>
                <c:if test="${requestScope.pageMsg.currentPage==requestScope.pageMsg.totalPage&&requestScope.pageMsg.totalPage<=6}">
                        <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${requestScope.pageMsg.currentPage}">${requestScope.pageMsg.currentPage}</a>
                </c:if>
       <c:if test="${requestScope.pageMsg.currentPage != requestScope.pageMsg.totalPage}">
           <a href="${pageContext.request.contextPath}/orderInfoController/showOrderListByPaging?currentPage=${requestScope.pageMsg.currentPage+1}">下一页</a>
       </c:if>
            </div>
        </td>
    </tr>
</c:if>
</c:if>
</body>
</html>
