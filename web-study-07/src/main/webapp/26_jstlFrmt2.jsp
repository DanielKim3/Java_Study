<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
<c:set var="now" value="<%= new java.util.Date() %>"></c:set>
<%-- \${now} : ${now} --%>
		<!-- 연월일 -->
		<fmt:formatDate value="${now}"/>		
		date :<fmt:formatDate value="${now}" type="date"/>
		<!-- 날짜로 출력 -->
		time :<fmt:formatDate value="${now }" type="time"/>
		<!-- time : 시간 형태로 출력 -->
		both :<fmt:formatDate value="${now }" type="both"/>
		<!-- both : 날짜, 시간 모두 출력  -->		
		
		default: <fmt:formatDate value="${now}"
		type="both" dateStyle="default" timeStyle="default"/>
		short : <fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"/>
		medium : <fmt:formatDate value="${now }" type="both" dateStyle="medium" timeStyle="medium"/>
		long : <fmt:formatDate value="${now }" type="both" dateStyle="long" timeStyle="long"/>
		full : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
		
		pattern="yyyy년 mm월 dd일 hh시 mm분 ss초" :
			<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>
			<fmt:formatDate value="${now }" pattern="MM월 dd일"/>
</pre>
</body>
</html>