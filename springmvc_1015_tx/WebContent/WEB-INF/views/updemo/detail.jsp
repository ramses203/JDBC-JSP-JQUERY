<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="urlPath"
	value="${pageContext.request.contextPath }/resources" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div style="width: 1000px; margin: auto; border: 1px solid;">
<%--list의 주소가 vo안에 인덱스가 0 만 있으니 0의 주소는 Map이니까 Map의 키값으로 값을 접근 --%>
	번호 : ${vo[0].NO }
	<br> 아이디 : ${vo[0].ID }
	<br> 이름 : ${vo[0].UNAME }
	<br> 이미지 :
	<c:forEach var="e" items="${vo }">
	<img src="${urlPath }/imgfile/${e.IMG1 }" style="width: 300px;">
	</c:forEach>
	<br> 나이 : ${vo[0].AGE }
	<br> 작성일 :${vo[0].MDATE }
	<br>
	<input type="button" id="goBtn1" value="파일리스트">
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(function() {
			$('#goBtn1').click(function() {
				location = "uplist";
			});
		});
	</script>
</body>
</html>