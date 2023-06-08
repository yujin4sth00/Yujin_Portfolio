<%@page import="reserve.reserveDo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<% request.setCharacterEncoding("utf-8");%>
<h2>수정할 내용(예약자 이름은 수정 불가입니다.)</h2>

<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application" />
<%
	String name=request.getParameter("name");
	reserveDo rdo = rdao.getOneReserve(name);
%>


<form action="reserveModifyProc.jsp" method="post">
		<table border="1">
			<tr height="60" align="center">
				<td width="150">이름</td>
				<td width="250">
					<input type="text" value="<%= rdo.getName() %>" name="name">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">연락처</td>
				<td width="250">
					<input type="text" value="<%= rdo.getPhone() %>" name="phone">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">종류</td>
				<td width="250">
					<input type="text" value="<%= rdo.getType() %>" name="type">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">크기</td>
				<td width="250">
					<input type="text" value="<%= rdo.getSize() %>" name="size">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">문구</td>
				<td width="250">
					<input type="text" value="<%= rdo.getLetter() %>" name="letter">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">초 개수</td>
				<td width="250">
					<input type="text" value="<%= rdo.getCandle() %>" name="candle">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="150">색상</td>
				<td width="250">
					<input type="text" value="<%= rdo.getColor() %>" name="color">
				</td>
			</tr>
			
			
			<tr height="60" align="center">
				<td colspan="2">
					<input type="hidden" name="name" value="<%= rdo.getName() %>">
					<input type="submit" value="수정완료">
					<input type="reset" value="전체 예약" onclick="location.href='reserveList.jsp'">
				</td>
			</tr>
		</table>
</form>

</body>
</html>