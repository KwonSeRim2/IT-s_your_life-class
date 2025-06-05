<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 5.
  Time: 오후 3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>새 타코야끼 메뉴 추가</h1>
<form method="post" action="add">
  이름: <input type="text" name="name" id="name"><br>
  가격: <input type="text" name="price" id="price"><br>
  <input type="button" value="추가">
</form>
<a href="list">← 메누판으로 돌아가기</a>
</body>
</html>
