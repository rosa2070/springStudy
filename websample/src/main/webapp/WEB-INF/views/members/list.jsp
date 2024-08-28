<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1>
<table>
	<tr>
		<th>회원번호</th><th>이름</th><th>전화번호</th><th>주소</th><th>가입일</th>
	</tr>
	<c:forEach var="mem" items="${list }">
		<tr>
			<td>${mem.num }</td>
			<td>${mem.name }</td>
			<td>${mem.phone }</td>
			<td>${mem.addr }</td>
			<td>${mem.regdate }</td>
			<!-- 삭제 후 result.jsp에서 결과 출력 -->
			<td><a href="<%=request.getContextPath()%>/members/delete?num=${mem.num}">삭제</a></td>
			<!-- 수정기능 완성하기 -->
			<td><a href="<%=request.getContextPath()%>/members/update?num=${mem.num}">수정</a></td>
		</tr>
	</c:forEach>
</table>
<a href="<%=request.getContextPath() %>/">홈으로</a>

</body>
</html>