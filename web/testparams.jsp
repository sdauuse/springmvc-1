<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/8
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/testparams?name=lky&age=18">测试params</a>
<a href="${pageContext.request.contextPath}/testant/ab">测试ant ??</a>
<a href="${pageContext.request.contextPath}/testant/dasdsads/hh">测试ant *</a>
<a href="${pageContext.request.contextPath}/testant/testant/sdhahd/dsahdash/dhas/zz">测试ant **</a>
<hr>
 <a href="${pageContext.request.contextPath}/testheader">测试请求头</a>
<hr>
测试rest delete <br>
<form action="${pageContext.request.contextPath}/testrest" method="post">

    <input type="hidden" name="_method" value="delete">
    <input type="submit">
</form>
测试rest put修改 <br>
<form action="${pageContext.request.contextPath}/testrest" method="post">

    <input type="hidden" name="_method" value="put">
    <input type="submit">
</form>
测试rest get查询 <br>
<form action="${pageContext.request.contextPath}/testrest" method="get">

    <input type="submit">
</form>
测试rest post新增 <br>
<form action="${pageContext.request.contextPath}/testrest" method="post">
    <input type="submit">
</form>
</body>
</html>
