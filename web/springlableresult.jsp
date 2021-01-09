<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/9
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>springmvc label test</h1>
<fm:form modelAttribute="user" action="${pageContext.request.contextPath}/testValidate">
    <fm:input path="userName"/> <fm:errors path="userName" cssStyle="color: red"/> <br>
    <fm:input path="userAge"/> <fm:errors path="userAge" cssStyle="color: red"/> <br>
    <fm:checkboxes path="hobby" items="${allhobby}"></fm:checkboxes> <br>
    <fm:select path="pet.name" items="${petList}" itemValue="name" itemLabel="name"></fm:select> <br>
    <fm:select path="pet.color" items="${petList}" itemValue="color" itemLabel="color"></fm:select> <br>
    <input type="submit">
</fm:form>
</body>
</html>
