<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="rdo" class="reserve.reserveDo">
	<jsp:setProperty name="rdo" property="*" />
</jsp:useBean>
<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application"/>
<%
	rdao.modifyReserve(rdo);
	response.sendRedirect("reserveList.jsp");
%>
</body>
</html>