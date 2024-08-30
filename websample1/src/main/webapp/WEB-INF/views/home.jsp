<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB-INF/views/home.jsp</title>
</head>
<body>
<h1>Home!!!!!</h1>
<img src="<%=request.getContextPath()%>/resources/images/1.jpg">
<ul>
	<li><a href="fortune?day=1">오늘의 운세</a></li>
	<li><a href="fortune?day=2">내일의 운세</a></li>
	<li><a href="<%=request.getContextPath()%>/members/insert">멤버가입</a></li>
	<li><a href="<%=request.getContextPath()%>/members/list">멤버목록</a></li>

</ul>

</body>
</html>