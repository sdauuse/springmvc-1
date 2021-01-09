<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/9
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/download/111.png">111.png图片下载</a>
<a href="${pageContext.request.contextPath}/download/222.png">222.png图片下载</a>

<hr>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="submit" value="上传文件">
</form>
</body>
</html>
