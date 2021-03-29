<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
h1 {
	text-align: center;
}

#LoginFormArea {
	text-align: center;
	width: 250px;
	margin: auto;
	border: 1px solid red; /*실선 = solid*/
}
</style>
</head>
<body>
	<h1>로그인</h1>
	<section id="LoginFormArea">
		<form action="sessionLogin" method="get">
			<label id="id">아이디</label> <input type="id" name="id" id="id">
				<br>
			<label id="passwd">비밀번호</label>
			<input type = "password" name="passwd" id="passwd">
			<!-- name 값 표기 id는 들어오는 값 -->
			<br>
			<br> <input type="submit" value="로그인">
		</form>
	</section>
</body>
</html>