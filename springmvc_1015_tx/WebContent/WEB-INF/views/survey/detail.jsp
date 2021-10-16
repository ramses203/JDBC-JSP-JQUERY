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
	번호 : ${vo[0].NUM }
	<br> 아이디 : ${vo[0].SUB }
	<br> 이름 : ${vo[0].CODE }
	<br> 나이 : ${vo[0].SDATE }
	<br> 작성일 :${vo[0].SUBTYPE }
	<c:forEach var="e" items="${vo }">
	<br>${e.SURVEYTITLE }
	</c:forEach>
	<br>${vo[0].SURVEYCNT }
	<input type="button" value="아무것두아닙니다">
	</div>
</body>
</html>