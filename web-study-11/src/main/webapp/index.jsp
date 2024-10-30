<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
response.sendRedirect(request.getContextPath() + "/BoardServlet?command=board_list");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="BoardServlet">
	<h3>command를 입력하시오</h3>
	<input type="text" name="command" placeholder="board_list">
	<input type="submit" value="입력">
	</form>
</body>
</html>