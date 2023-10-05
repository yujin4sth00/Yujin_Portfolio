<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<div class="container" style="max-width:600px; border:1px solid #eee; border-radius:5px; margin-top:50px; box-shadow:0 10px 20px rgba(0,0,0,0.3); padding: 20px;">
  		<p class="text-start fs-1 fs-bold">Login</p>
  		<form action="loginProc.jsp" method="post">
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label fw-bold fs-4">Username</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label fw-bold fs-4">password</label>
		    <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="password">
		    <button type="submit" class="btn btn-primary">확인</button>
		  <button type="submit" class="btn btn-primary">취소</button>
		  </div>
		  </form>
</body>
</html>