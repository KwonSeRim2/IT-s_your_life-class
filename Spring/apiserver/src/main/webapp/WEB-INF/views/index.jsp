<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 9.
  Time: 오전 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>환영합니다.</h1>
<%--로그인 안한 경우--%>
<sec:authorize access="isAnonymous()">
    <a href="/security/login">로그인</a>
</sec:authorize>

<%--로그인 한 경우--%>
<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal.username"/>
    <form action="/security/logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="로그아웃"/>
    </form>
</sec:authorize>
</body>
</html>
