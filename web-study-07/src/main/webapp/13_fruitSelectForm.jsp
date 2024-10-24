<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="selectFruit.jsp" method="post">
	<label for="fruit">과일 선택</label><br>
	<select id="fruit" name="fruit">
		<option value="1">사과</option>
		<option value="2">바나나</option>
		<option value="3">메론</option>
	</select>
	<input type="submit" value="전송">
</form>
</body>
</html>