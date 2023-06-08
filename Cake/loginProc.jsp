<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		
		response.sendRedirect("cakeForm1.jsp");
	%>
</body>
</html>