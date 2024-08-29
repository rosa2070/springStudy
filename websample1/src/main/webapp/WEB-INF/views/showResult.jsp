<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showResult.jsp</title>
</head>
<body>
<h1>두수합 결과</h1>
${param.num1 } + ${param.num2 } = ${num3 }<br>
<a href="<%=request.getContextPath()%>/">홈으로</a>
</body>
</html>