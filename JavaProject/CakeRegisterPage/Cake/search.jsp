<%@page import="java.util.ArrayList"%>
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
<h2>예약자 검색 결과</h2>
<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application"/>
<% 
String search= request.getParameter("search");
ArrayList<reserveDo> sList = rdao.getAllsearch(search);
for(int i=0; i<sList.size(); i++){
	reserveDo rdo = sList.get(i);
	out.println((i+1) + " . 이름: " + rdo.getName() + "  연락처 :" + rdo.getPhone()+ "  종류: " + rdo.getType() +  "<br>");
}
	%>
	



</body>
</html>