<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="urlPath" value="${pageContext.request.contextPath }/resources"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>.
<p>${urlPath }</p>
<table>
	<c:forEach var="e" items="${list }">
		<tr>
			<td>${e.no }</td>
			<td>
			<a href="updemoDetail?no=${e.no }"><img src="${urlPath }/imgfile/${e.orifile}"
			style="width: 80px;"></a>
			</td>
			<td>${e.uname }</td>
		</tr>
	</c:forEach>

	<tr>
		<td><input type="button" id="goBtn1" value="파일업로드폼"></td>
	</tr>
	</table>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(function() {
			$('#goBtn1').click(function() {
				location = "upform";
			})
		});
	</script>
	
</body>
</html>