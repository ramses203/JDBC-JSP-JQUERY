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
<%--list�� �ּҰ� vo�ȿ� �ε����� 0 �� ������ 0�� �ּҴ� Map�̴ϱ� Map�� Ű������ ���� ���� --%>
	��ȣ : ${vo[0].NO }
	<br> ���̵� : ${vo[0].ID }
	<br> �̸� : ${vo[0].UNAME }
	<br> �̹��� :
	<c:forEach var="e" items="${vo }">
	<img src="${urlPath }/imgfile/${e.IMG1 }" style="width: 300px;">
	</c:forEach>
	<br> ���� : ${vo[0].AGE }
	<br> �ۼ��� :${vo[0].MDATE }
	<br>
	<input type="button" id="goBtn1" value="���ϸ���Ʈ">
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