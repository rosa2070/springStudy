<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원수정</h1>
<form method="post" action="${pageContext.request.contextPath }/members/update">
	번호<br>
	<input type="text" name="num" value="${member.num }"><br>
	이름<br>
	<input type="text" name="name" value="${member.name }"><br>
	전화번호<br>
	<input type="text" name="phone" value="${member.phone }"><br>
	주소<br>
	<input type="text" name="addr" value="${member.addr }"><br>
	<input type="submit" value="수정">
</form>
</body>
</html>