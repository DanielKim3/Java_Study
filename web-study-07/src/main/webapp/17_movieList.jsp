<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[]movieList = {"타짜", "살인의 추억", "올드보이", "인셉션", "태극기 휘날리며", "인터스텔라", "타이타닉", "굿 윌 헌팅", "아이엠 샘", "비긴어게인"};
pageContext.setAttribute("movieList", movieList);
%>
<c:forEach var="movie" items="${movieList}" begin="1" end="10" varStatus="status">
	${cnt} <c:if test="${not status.last}">,</c:if>
</c:forEach>
<br><br>
<table border="1" style="width: 100%; text-align:center;">
	<tr>
		<th>index</th> <th>count</th> <th>movie</th>
	</tr>
<c:forEach var="movie" items="${movieList}" begin="7" end="10" varStatus="status">
<tr>
	<td>${status.index}</td>
	<td>${status.count}</td>
	<td>${movie}</td>
</tr>
</c:forEach>	
</table>
<br><br>
<table border="1" style="width: 100%; text-align: center;">
<tr>
	<th>index</th> <th>count</th> <th>movie</th>
</tr>
<c:forEach var="movie" items="${movieList}" begin="1" end="10" varStatus="status" step="2">
	<tr>
		<td>${status.index}</td>
		<td>${status.count}</td>
		<td>${movie}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>