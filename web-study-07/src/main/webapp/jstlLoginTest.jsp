<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${param.select == 1}">
	<h1>${param.id}님 사용자로 로그인 성공</h1>
	
</c:if>
<c:if test="${param.select == 2}">
	<h1>${param.id}님 관리자로 로그인 성공</h1>
</c:if>
