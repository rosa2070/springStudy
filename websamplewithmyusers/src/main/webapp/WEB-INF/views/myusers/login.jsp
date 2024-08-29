<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myusers/login.jsp</title>
</head>
<body>
<h1>회원로그인</h1>
<form method="post" action="${pageContext.request.contextPath }/login">
	아이디 <input type="text" name="username"><br>
	비밀번호 <input type="password" name="password"><br>
	${errMsg }<br>
	<input type="submit" value="로그인">
</form>
</body>
</html>