<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String[] movieList = {"아바타","스파이더맨","앤드게임"};
	request.setAttribute("movieList", movieList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--forEach태그는 : item속성을 사용해서 배열과 collection 데이터를 반복해서 출력하는 작업을 처리할 수 있다.   --%>
<table style="width: 300px;">
<c:forEach var="movie" items="${movieList }" varStatus="i">
<tr>
<td style="border: 1px dotted;">${i.count }/${movie }</td>
</tr>
</c:forEach>
</table>
</body>
</html>