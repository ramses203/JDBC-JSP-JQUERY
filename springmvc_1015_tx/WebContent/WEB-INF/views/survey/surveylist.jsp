<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="e" items="${list }">
			<tr>
				<td>${e.num }</td>
				<td>${e.sub }</td>
				<td>${e.code }</td>
				<td>${e.sdate }</td>
			</tr>
		</c:forEach>
		
	</table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
</body>
</html>