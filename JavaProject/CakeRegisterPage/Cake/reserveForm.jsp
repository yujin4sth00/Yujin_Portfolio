<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2 align="center"> 예약하기 </h2>
	<form action="reserveProc.jsp" method="get">
	<center>
		<table border="1">
			<tr height="60" align="center">
				<td width="200">이름</td>
				<td width="500">
					<input type="text" name="name">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="200">연락처</td>
				<td width="500">
					<input type="text" name="phone">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="200">케이크 종류</td>
				<td width="500">
					<input type="checkbox" name="type" value="과일">과일
					<input type="checkbox" name="type" value="티라미수">티라미수
					<input type="checkbox" name="type" value="초콜릿">초콜릿
					<input type="checkbox" name="type" value="고구마">고구마
				</td>
			</tr>
			
			<tr height="60" align="center">
				<td width="200">크기</td>
				<td width="500">
					<select name="size">
						<option selected>홀케이크</option>
						<option>도시락 케이크</option>
					</select>
					
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="200">적고 싶은 문구(15글자 내)</td>
				<td width="500">
					<input type="text" name="letter">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="200">초 개수</td>
				<td width="500">
					<input type="text" name="candle">
				</td>
			</tr>
			<tr height="60" align="center">
				<td width="200">크림 색상(여러 개 가능)</td>
				<td width="500">
					<input type="checkbox" name="color" value="Yellow">노란색
					<input type="checkbox" name="color" value="Blue">하늘색
					<input type="checkbox" name="color" value="Pink">분홍색
				</td>
			</tr>
			
			
			
			<tr height="60" align="center">
				<td colspan="2">
					<input type="submit" value="예약">
					<input type="reset" value="취소" onclick="location.href='cakeForm1.jsp'">
				</td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>