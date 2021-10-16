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
	<p>${urlPath }</p>
	이미지를 클릭하면 detail로 갑니다
	<table>
		<c:forEach var="e" items="${list }">
			<tr>
				<td>번호 : ${e.no }</td>
				<td>이미지 : <a href="updemoDetail?no=${e.no }"><img src="${urlPath }/imgfile/${e.orifile }" style="width: 400px;"></a></td>
				<td>이름 : ${e.uname }</td>
			</tr>
		</c:forEach>
		<tr>
			<td><input type="button" id="goBtn1" value="파일업로드폼"></td>
			<td><input type="button" id="goBtn2" value="멀티파일업로드폼"></td>
		</tr>
	</table>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(function() {
			$('#goBtn1').click(function() {
				location = "upform";
			});
			$('#goBtn2').click(function() {
				location = "upform2";
			});
		});
	</script>
</body>
</html>