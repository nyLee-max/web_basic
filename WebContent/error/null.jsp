<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Null 에러 발생</title>
</head>
<body>
	<strong>Null 에러 발생</strong>
	<br>
	<br>
	<h4>주소를 올바르게 입력했는지 확인해보시기 바랍니다.</h4><br>
	<br>
	발생한 예외 종류 : <%=exception.getClass().getName() %><br>
	에러 메시지 : <%=exception.getMessage() %><br>
</body>
</html>