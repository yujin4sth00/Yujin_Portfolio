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

<%
	request.setCharacterEncoding("utf-8");
String logout = request.getParameter("logout");
	if(logout != null) {
		session.setAttribute("id", null);
	}
	String id = (String) session.getAttribute("id");
	if(id ==null) {
		id = "손님";
	}
	%>


<nav class="navbar navbar-expand-lg navbar-light" style="background-color:#e3f2fd;">
  <div class="container-fluid">
   <a class="navbar-brand" href="#">
      <img src="./assets/img1.png" alt="" width="30" height="30" class="d-inline-block align-text-top">
      주문제작 레터링 케이크
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="cakeForm1.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="reserveForm.jsp">예약하기</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="reserveList.jsp">예약현황</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="#">예약 시 주의사항</a>
        </li>
      </ul>
      <%
      	if(id.equals("손님")){
      	%>
      		<%=id %> 님 <input class="btn btn-outline-success" type = "button" value = "로그인" onclick="location.href='loginForm.jsp'" style="margin-left:20px;">
      	<% 
      		}
      	else{      
      	%>
      	<%=id %> 님 <input class="btn btn-outline-success" type = "button" value = "로그아웃" onclick="location.href='cakeForm1.jsp?logout=1'" style="margin-left:20px;">
      	<%
      		}
      	
      %>
    </div>
  </div>
</nav>
</body>
</html>