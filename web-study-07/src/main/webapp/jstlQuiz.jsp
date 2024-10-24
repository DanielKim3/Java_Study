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
String[]seasonList = {"봄","여름","가을","겨울"};
pageContext.setAttribute("seasonList", seasonList);
%>
<select name="season">
<c:forEach var="season" items="${seasonList}">
	<option value="${season}">${season}</option>
</c:forEach>
</select>
</body>
</html>