<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 예제</title>
<style type="text/css">
h1 {
	text-align: center;
}

table {
	margin: auto;
	width: 800px;
	border: 1px solid red;
}
</style>
</head>
<body>
	<h1>헤더 정보 예제</h1>
	<table>
		<tr>
			<td>헤더이름</td>
			<td>헤더값</td>
		</tr>
		<%
			Enumeration<String> e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String headerName = e.nextElement();
		%>
		<tr>
			<th><%=headerName%></th>
			<td><%=request.getHeader(headerName)%></td>
		</tr>

		<%
			}
		%>
	</table>

	<hr>

	<h1>쿠기, URL/URI, 요청방식에 관련된 정보 예제</h1>
	<table border='1'>
		<%
			Cookie[] cookie = request.getCookies();
		%>
		<tr>
			<td>쿠키정보</td>
			<%
				if (cookie == null) {
			%>
			<td>쿠키가 존재하지 않습니다.</td>

			<%
				} else {
			for (int i = 0; i < cookie.length; i++) {
			%>
			<td><%=cookie[i].getName()%>(<%=cookie[i].getValue()%>)&nbsp;&nbsp;
				<%
					}

				}
				%>
		</tr>
		
		<tr><td>서버 도메인명</td><td><%= request.getServerName() %></td></tr>
		<tr><td>서버 포트번호</td><td><%= request.getServerPort() %></td></tr>
		<tr><td>요청 URL</td><td><%= request.getRequestURI() %></td></tr>
		<tr><td>요청 URI</td><td><%= request.getRequestURI()%></td></tr>
		<tr><td>요청 쿼리</td><td><%= request.getQueryString() %></td></tr>
		<tr><td>클라이언트 호스트명</td><td><%= request.getRemoteHost() %></td></tr>
		<tr><td>클라이언트 IP 주소</td><td><%= request.getRemoteAddr() %></td></tr>
		<tr><td>프로토콜</td><td><%= request.getMethod() %></td></tr>
		<tr><td>요청방식</td><td><%= request.getContextPath() %></td></tr>
		
		
	</table>
</body>
</html>