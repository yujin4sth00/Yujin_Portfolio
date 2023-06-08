
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
<nav class="navbar navbar-expand-lg bg-body-tertiary" style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">전체 예약 현황</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="cakeForm1.jsp">Home</a>
        </li>
      </ul>
      <nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <form class="d-flex" action="search.jsp" method="post">
    	<input type="text" placeholder="예약자 입력" name="search">
    	<input type="submit" value="검색">
    </form>
  </div>
</nav>
    </div>
  </div>
</nav>

<jsp:useBean id="rdao" class="reserve.reserveDao" scope="application" />
<%
	int count = rdao.selectCnt("table");
	String tempStart = request.getParameter("page");
	int startPage = 0;
	int onePageCnt = 10;
	count = (int)Math.ceil((double)count/(double)onePageCnt);
	if(tempStart != null){
		startPage = (Integer.parseInt(tempStart)-1)*onePageCnt;
	}
	ArrayList<reserveDo> c = rdao.selectPage("table", startPage, onePageCnt);
	%>
	<%
		for(int i=0; i<c.size(); i++){
			%>
			<div class="accordion" id="accordionExample">
		 	 <div class="accordion-item">
		    	<h2 class="accordion-header">
		      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
		        <p>예약자 순서 : <%=(i+1) %> .  <%= c.get(i).getName() %></p>
		      </button>
		    </h2>
		    <div id="collapseOne" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
		      <div class="accordion-body">
		        <p>이름: <a href="reserveInfo.jsp?name=<%= c.get(i).getName()%>"><%= c.get(i).getName() %></a></p>
		        <p>연락처: <%= c.get(i).getPhone() %></p>
		        <p>종류: <%= c.get(i).getType() %></p>
		        <p>크기: <%= c.get(i).getSize() %></p>
		        <p>문구: <%= c.get(i).getLetter() %></p>
		        <p>초 개수: <%= c.get(i).getCandle() %></p>
		        <p>색상: <%= c.get(i).getColor() %></p>
		      </div>
		    </div>
		  </div>
		</div>
		<% }%>
	<%
		for(int i=1; i<=count; i++){
		%>
		<a href="reserveList.jsp?page=<%=i %>">[<%=i %>]
		</a>
			
		<% }%>
	


</body>
</html>