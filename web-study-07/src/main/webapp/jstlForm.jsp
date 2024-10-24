<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="jstlLoginTest.jsp">
아이디 : <input type="text" name="id" id="id"><br>
비밀번호 : <input type="password" name="pw" id="pw"><br>
<input type="radio" name="select" id="user" value="1" checked> 사용자
<input type="radio" name="select" id="admin" value="2"> 관리자<br>
<input type="submit" value="로그인">
</form>
</body>
</html>