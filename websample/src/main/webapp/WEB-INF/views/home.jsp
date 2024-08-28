<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB-INF/views/home.jsp</title>
</head>
<body>
<h1>Home!!!!!</h1>
<ul>
	<li><a href="fortune?day=1">오늘의 운세</a></li>
	<li><a href="fortune?day=2">내일의 운세</a></li>
	<li><a href="<%=request.getContextPath()%>/members/insert">멤버가입</a></li>
	<li><a href="<%=request.getContextPath()%>/members/list">멤버목록</a></li>
	<!--  myusers테이블과 연동해서 회원정보 등록하기(과제) -->
	<li><a href="">회원가입</a></li>
</ul>
<!--  
<form method="post" action="<%=request.getContextPath()%>/math/sum">
	수1 <input type="text" name="num1"><br>
	수2 <input type="text" name="num2"><br>
	<input type="submit" value="두수합구하기">
</form>
-->
</body>
</html>