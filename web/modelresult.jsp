<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/8
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
request蔬菜名字:${requestScope.goods.name}<br>
request蔬菜价格:${requestScope.goods.price}<br>
<hr>
session蔬菜名字:${sessionScope.goods.name}<br>
session蔬菜价格:${sessionScope.goods.price}
</body>
</html>
