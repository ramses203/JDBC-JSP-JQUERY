<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String[] movieList = {"�ƹ�Ÿ","�����̴���","�ص����"};
	request.setAttribute("movieList", movieList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--forEach�±״� : item�Ӽ��� ����ؼ� �迭�� collection �����͸� �ݺ��ؼ� ����ϴ� �۾��� ó���� �� �ִ�.   --%>
<table style="width: 300px;">
<c:forEach var="movie" items="${movieList }" varStatus="i">
<tr>
<td style="border: 1px dotted;">${i.count }/${movie }</td>
</tr>
</c:forEach>
</table>
</body>
</html>