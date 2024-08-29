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
<ul>
	<li><a href="fortune?day=1">오늘의 운세</a></li>
	<li><a href="fortune?day=2">내일의 운세</a></li>
	<li><a href="<%=request.getContextPath()%>/members/insert">멤버가입</a></li>
	
	<!-- 로그인한 사용자만 멤버목록을 사용할 수 있도록 구현해 보세요.
	로그인안했으면 로그인 페이지로
	로그인했으면 멤버목록이 보여진다.
	 -->
	<li><a href="<%=request.getContextPath()%>/members/list">멤버목록</a></li>

	
	
	<!--  myusers테이블과 연동해서 회원정보 등록하기(과제) -->
	<li><a href="${pageContext.request.contextPath }/myusers/insert">회원가입</a></li>
	<!-- 로그아웃 기능 구현해보기(로그아웃 후 home으로 이동) -->
	
	<c:choose>
		<c:when test="${empty sessionScope.username }">
			<li><a href="${pageContext.request.contextPath }/login">로그인</a></li>
		</c:when>
		<c:otherwise>	
			<li>
			${username }님 반갑습니다..
			<a href="${pageContext.request.contextPath }/logout">로그아웃</a></li>
		</c:otherwise>
	</c:choose>
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