<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/myusers/insert.jsp</title>
</head>
<body>
<h1>회원가입</h1>
<form method="post" action="${pageContext.request.contextPath }/myusers/insert">
	회원아이디<br>
	<input type="text" name="username"><br>
	비밀번호<br>
	<input type="password" name="password"><br>
	이메일<br>
	<input type="text" name="email"><br>
	<input type="submit" value="가입">
</form>
</body>
</html>