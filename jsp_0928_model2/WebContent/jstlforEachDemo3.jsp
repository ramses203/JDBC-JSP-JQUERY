<%@page import="java.util.ArrayList"%>
<%@page import="exam.Customer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String[] movieList = {"아바타","스파이더맨","앤드게임"};
	request.setAttribute("movieList", movieList);
	
	ArrayList<Customer> cusList = new ArrayList();
	cusList.add(new Customer("빅맨1","big1@kosmo.com","010-9999-9991"));
	cusList.add(new Customer("빅맨2","big2@kosmo.com","010-9999-9992"));
	cusList.add(new Customer("빅맨3","big3@kosmo.com","010-9999-9993"));
	request.setAttribute("cusList", cusList);
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
<hr>
<h2>여러분이 구현합니다.</h2>
<table style="width: 300px;">

<tr>
<th>번호</th><th>이름</th><th>메일</th><th>연락처</th>
</tr>

<c:forEach var="cus" items="${cusList }" varStatus="i">
<tr>
<td>${i.count }</td><td>${cus.name }</td><td>${cus.email }</td><td>${cus.phone }</td>
</tr>
</c:forEach>
</table>
</body>
</html>