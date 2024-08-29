<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>members/result.jsp</title>
</head>
<body>
<h1>요청작업 완료!!!</h1>
<c:choose>
	<c:when test="${code=='success' }">
		요청작업 성공!!!!!!!!!
	</c:when>
	<c:otherwise>
		오류로 인해 요청작업 실패!!!!!!!!!!!
	</c:otherwise>
</c:choose>
<a href="<%=request.getContextPath() %>/">홈으로</a>
<!-- 상대경로로 홈으로 
<a href="../">홈으로</a>
-->
</body>
</html>