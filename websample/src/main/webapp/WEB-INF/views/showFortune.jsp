<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showFortune.jsp</title>
</head>
<body>
<h1>운세결과</h1>
${result }
<br>
<a href="<%=request.getContextPath()%>/">홈으로</a>
</body>
</html>