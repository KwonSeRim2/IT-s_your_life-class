<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 2.
  Time: 오후 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>

</head>
<body>
<h1>getParameter</h1>
<form action="login" method="get">
  <fieldset>
    <legend>로그인 폼</legend>
    <ul style="list-style: none">
      <li>
        <label for="userid">아이디</label>
        <input type="text" id="userid" name="userid">

      </li>
      <li>
        <label for="password">아이디</label>
        <input type="password" id="password" name="password">
      </li>
      <li>
        <input type="submit" value="전송">
      </li>
    </ul>
  </fieldset>
</form>
</body>
</html>
