
<%@page import="reserve.reserveDo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");%>

<jsp:useBean id="rdo" class="reserve.reserveDo">
	<jsp:setProperty name="rdo" property="*"/>
</jsp:useBean>
<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application"/>
<% String[] color = request.getParameterValues("color");
	String colorText="";
	for(int k=0; k<color.length; k++){
		colorText += color[k] + " ";
	}rdo.setColor(colorText);
	rdao.insertReserve(rdo);
	
%>
<h2 align="center">예약 확인</h2>
<table border="1">
			<tr height="50">
				<td align="center" width="150">이름</td>
				<td align="center" width="250"><%= rdo.getName() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">연락처</td>
				<td align="center" width="250"><%= rdo.getPhone() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">종류</td>
				<td align="center" width="250"><%= rdo.getType() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">크기</td>
				<td align="center" width="250"><%= rdo.getSize() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">문구</td>
				<td align="center" width="250"><%= rdo.getLetter() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">초 개수</td>
				<td align="center" width="250"><%= rdo.getCandle() %></td>
			</tr>
			<tr height="50">
				<td align="center" width="150">색상</td>
				<td align="center" width="250"><%= rdo.getColor() %></td>
			</tr>
			
</table>
<a href="reserveList.jsp">전체 예약 현황</a>

</body>
</html>