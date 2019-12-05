<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/2
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>输入查询</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 网站信息</strong></div>
       <div class="body-content">
        <form method="post" class="form-x" action="${pageContext.request.contextPath}/examBookController/examBookById">
            <div class="form-group">
                <div class="label">
                    <label>输入图书号查询：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="book_id" placeholder="请输入正确的ISBN号查询">
                        <div class="tips"></div>
                    </div>
                    &nbsp;&nbsp; <button class="button bg-main icon-check-square-o" type="submit">提交</button>
                </div>
            </div>
        </form>
           <div  style="position: relative;right: -120px">
           <span  style="color:red">${empty_error}</span>
           </div>
       </div>
</div>

</body>
</html>
