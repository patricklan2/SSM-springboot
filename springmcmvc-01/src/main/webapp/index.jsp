<%--
  Created by IntelliJ IDEA.
  User: lan
  Date: 2023/2/11
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br>
<form action="${pageContext.request.contextPath}/one.action" method="post">
    姓名: <input name="name"><br>
    年龄: <input name="age"><br>
    <input type="submit" value="提交">
</form>
<br><br><br>
<form action="${pageContext.request.contextPath}/two.action" method="get">
    姓名: <input name="name"><br>
    年龄: <input name="age"><br>
    <input type="submit" value="提交">
</form>
<br><br><br>
<a href="${pageContext.request.contextPath}/three/王五/27.action" methods="get">动态提交</a>
<form action="${pageContext.request.contextPath}/four.action" method="get">
    姓名: <input name="name"><br>
    年龄: <input name="age"><br>
    <input type="submit" value="提交">
</form>
<br><br><br>
<form action="${pageContext.request.contextPath}/five.action" method="get">
    姓名: <input name="name"><br>
    年龄: <input name="age"><br>
    <input type="submit" value="提交">
</form>

<br><br><br>
<a href="${pageContext.request.contextPath}/jumpOne.action">页面跳转...</a><br><br>
<a href="${pageContext.request.contextPath}/jumpTwo.action">跳转action...</a><br><br>
<a href="${pageContext.request.contextPath}/jumpThree.action">页面重定向...</a><br><br>
<a href="${pageContext.request.contextPath}/jumpFour.action">重定向action...</a><br><br>

</body>
</html>
