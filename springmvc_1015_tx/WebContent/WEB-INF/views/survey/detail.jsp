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
	��ȣ : ${vo[0].NUM }
	<br> ���̵� : ${vo[0].SUB }
	<br> �̸� : ${vo[0].CODE }
	<br> ���� : ${vo[0].SDATE }
	<br> �ۼ��� :${vo[0].SUBTYPE }
	<c:forEach var="e" items="${vo }">
	<br>${e.SURVEYTITLE }
	</c:forEach>
	<br>${vo[0].SURVEYCNT }
	<input type="button" value="�ƹ��͵ξƴմϴ�">
	</div>
</body>
</html>