<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/7
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/convert" method="post">
    年龄:<input type="text" name="age"> <br>
    日期:<input type="text" name="date"><br>
    姓名: <input type="text" name="name"><br>
    <input type="submit">
</form>
</body>
</html>
