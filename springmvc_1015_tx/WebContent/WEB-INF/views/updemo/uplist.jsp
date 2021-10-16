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
	�̹����� Ŭ���ϸ� detail�� ���ϴ�
	<table>
		<c:forEach var="e" items="${list }">
			<tr>
				<td>��ȣ : ${e.no }</td>
				<td>�̹��� : <a href="updemoDetail?no=${e.no }"><img src="${urlPath }/imgfile/${e.orifile }" style="width: 400px;"></a></td>
				<td>�̸� : ${e.uname }</td>
			</tr>
		</c:forEach>
		<tr>
			<td><input type="button" id="goBtn1" value="���Ͼ��ε���"></td>
			<td><input type="button" id="goBtn2" value="��Ƽ���Ͼ��ε���"></td>
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