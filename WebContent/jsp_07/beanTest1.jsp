<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#formArea{
	margin : auto;
	width : 400px;
	border : 1px solid black;
	}
	h1, fieldset{
	text-align : center;
	}
</style>
</head>
<body>
	<h1>property="*"테스트</h1>
	<form action = "beanTest2.jsp">
		<fieldset>
			<label for="stdNo">번호<input type="text" name="stdNo" id="stdNo"></label><br>
			<label for="stdName">이름<input type="text" name="stdName" id="stdName"></label><br>
			<label for="kor">국어<input type="text" name="kor" id="kor"></label><br>
			<label for="eng">영어<input type="text" name="eng" id="eng"></label><br>
			<label for="math">수학<input type="text" name="math" id="math"></label><br>
			<input type="submit" value="전송">
		</fieldset>
	</form>
</body>
</html>