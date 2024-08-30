<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/insert</title>
</head>
<body>
<h1>글 등록</h1>
<form method="post" action="${pageContext.request.contextPath }/board/insert">
	작성자<br>
	<input type="text" name="writer"><br>
	제목<br>
	<input type="text" name="title"><br>
	내용<br>
	<textarea name="content" rows="10" cols="50"></textarea>
</form>
</body>
</html>