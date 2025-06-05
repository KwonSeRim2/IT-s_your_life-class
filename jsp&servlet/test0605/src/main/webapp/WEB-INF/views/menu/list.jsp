<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 5.
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>📝오늘의 메뉴판</h1>
<ul>
    <c:forEach var="each" items="${menuList}"><li>${each.name} - ${each.price}</li></c:forEach>
</ul>
<a href="add">➕새 메뉴 추가</a><br>

<a href="/">🏠돌아가기</a>
</body>
</html>
