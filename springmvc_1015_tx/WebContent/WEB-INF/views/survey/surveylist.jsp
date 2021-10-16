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
	<table>
		<c:forEach var="e" items="${list }">
			<tr>
				<td>번호 : <a href="surveyDetail?no=${e.num }">${e.num }</a></td>
				<td>문자열 : ${e.sub }</td>
				<td>code : ${e.code }</td>
				<td>sdate : ${e.sdate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>