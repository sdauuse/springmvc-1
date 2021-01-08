<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/7
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/testmapping1">测试mapping1</a>
  <a href="${pageContext.request.contextPath}/testmapping2">测试mapping2</a>
  <a href="${pageContext.request.contextPath}/show">点击跳转1</a>
  <br>
  <a href="${pageContext.request.contextPath}/show2?id=2&name=hah">点击跳转2</a>
  <hr>
  <form action="${pageContext.request.contextPath}/myform">
      userName:<input type="text" name="userName"><br>
      userAge:<input type="text" name="userAge"><br>
      <input type="submit">
  </form>
  <hr>
  <form action="${pageContext.request.contextPath}/myform2">
      userName:<input type="text" name="userName"><br>
      userName:<input type="text" name="userAge"><br>
      <input type="checkbox" value="篮球" name="hobby">篮球
      <input type="checkbox" value="足球" name="hobby">足球
      <input type="checkbox" value="羽毛球" name="hobby">羽毛球
      <input type="submit">
  </form>
  <form action="${pageContext.request.contextPath}/myform3">
      userName:<input type="text" name="userName"><br>
      userName:<input type="text" name="userAge"><br>
      <input type="checkbox" value="篮球" name="hobby">篮球
      <input type="checkbox" value="足球" name="hobby">足球
      <input type="checkbox" value="羽毛球" name="hobby">羽毛球
      <hr>
      ------------------------宠物------------------------<br>
      petName: <input type="text" name="pet.name"><br>
      petColor <input type="text" name="pet.color"><br>
      <input type="submit">
  </form>
  <form action="${pageContext.request.contextPath}/myform4">
      userName:<input type="text" name="userName"><br>
      userName:<input type="text" name="userAge"><br>
      <input type="checkbox" value="篮球" name="hobby">篮球
      <input type="checkbox" value="足球" name="hobby">足球
      <input type="checkbox" value="羽毛球" name="hobby">羽毛球
      <hr>
      ------------------------宠物------------------------<br>
      petName: <input type="text" name="pet.name"><br>
      petColor <input type="text" name="pet.color"><br>
      ------------------------宠物------------------------<br>
      petName: <input type="text" name="pets[0].name"><br>
      petColor <input type="text" name="pets[0].color"><br>
      ------------------------宠物------------------------<br>
      petName: <input type="text" name="pets[1].name"><br>
      petColor <input type="text" name="pets[1].color"><br>
      <input type="submit">
  </form>
  </body>
</html>
