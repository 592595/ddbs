<%--
  Created by IntelliJ IDEA.
  User: czg
  Date: 2019/11/16
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
        <form method="post" class="form-x" action="${pageContext.request.contextPath}/bookInfoController/InertBookInfo">

            <div class="form-group">
                <div class="label">
                    <label>图书编号：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="book_id" placeholder="图书编号为ISBN号" required />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图书名：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="book_name" placeholder="请输入图书名" required />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>作者：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="author" placeholder="请输入作者" required  />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图书单价：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="number" class="input" name="book_price" min="0.01" max="999.99" step="0.01" placeholder="请输入图书单价" required />
                        <div class="tips"></div>
                        <!---->
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>出版社：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="publishing_house" placeholder="请输入出版社" required />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>图书类型：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="text" class="input" name="book_type" placeholder="请输入图书类型，格式为aa-xxxx" required  />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>出版时间：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="date" class="input" name="publishing_time" placeholder="请输入出版时间，格式为xxxx/xx/xx" required  />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>库存：</label>
                </div>
                <div class="field">
                    <div class="field">
                        <input type="number" class="input" name="inventory" placeholder="请输入库存，只能输入整数" required  />
                        <div class="tips"></div>
                    </div>
                </div>
            </div>
            <div style="text-align:center">
                <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
