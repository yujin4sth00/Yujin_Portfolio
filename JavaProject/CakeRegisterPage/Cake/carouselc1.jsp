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

<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="./assets/cake3.jpg" class="d-block w-100" alt="..." style="height: 100vh;">
      <div class="carousel-caption d-none d-md-block">
        <h5>결혼 축하 문구 예시</h5>
        <p>촉촉하고 달콤한 시트와 동물성 생크림으로 만든 알록달록 케이크</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./assets/cake1.jpg" class="d-block w-100" alt="..." style="height: 100vh;">
      <div class="carousel-caption d-none d-md-block">
        <h5>생일 축하 문구 예시</h5>
        <p>사랑스러운 하트 모양의 과일 케이크</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="./assets/cake2.jpg" class="d-block w-100" alt="..." style="height: 100vh;">
      <div class="carousel-caption d-none d-md-block">
        <h5>문구 예시</h5>
        <p>시즌 한정 체리 케이크</p>
      </div>
    </div>
    
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

</body>
</html>