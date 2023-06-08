<%@page import="reserve.reserveDo"%>
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
<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application"/>
<% String name= request.getParameter("name");
	reserveDo rdo = rdao.getOneReserve(name);
	%>
	<table border="1">
			<tr height="60" align="center">
				<td width="150" align="center">이름</td>
				<td width="250" align="center">
					<%= rdo.getName() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">연락처</td>
				<td width="250" align="center">
					<%= rdo.getPhone() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">종류</td>
				<td width="250" align="center">
					<%= rdo.getType() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">크기</td>
				<td width="250" align="center">
					<%= rdo.getSize() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">문구</td>
				<td width="250" align="center">
					<%= rdo.getLetter() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">초 개수</td>
				<td width="250" align="center">
					<%= rdo.getCandle() %>
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150" align="center">색상</td>
				<td width="250" align="center">
					<%= rdo.getColor() %>
				</td>
			</tr>
			<tr height="60">
				<td align="center" colspan="2">
					<input type="button" value="수정하기" onclick="location.href='reserveModify.jsp?name=<%=rdo.getName() %>'">
					<input type="button" value="삭제하기" onclick="location.href='reserveDelete.jsp?name=<%=rdo.getName() %>'">
					<input type="button" value="전체" onclick="location.href='reserveList.jsp'">
				</td>
			</tr>
</table>
</body>
</html>