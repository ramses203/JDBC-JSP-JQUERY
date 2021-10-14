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
<body>
<div style="width: 400px; margin: auto">
번호 : ${vo.no }<br>
아이디 : ${vo.id }<br>
작성자 : ${vo.uname }<br>
<a><img src="${urlPath }/imgfile/${vo.orifile}"
			style="width: 80px;"></a>
나이 : ${vo.age }<br>		
작성일 : ${vo.mdate }<br>
<input type="button" id="goBtn2" value="파일리스트">
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>	
<script>
		$(function() {
			$('#goBtn2').click(function() {
				location = "updemoList";
			});
		});
	</script>	
</body>
</html>