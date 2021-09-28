<%@page import="java.util.ArrayList"%>
<%@page import="exam.Customer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String[] movieList = {"�ƹ�Ÿ","�����̴���","�ص����"};
	request.setAttribute("movieList", movieList);
	
	ArrayList<Customer> cusList = new ArrayList();
	cusList.add(new Customer("���1","big1@kosmo.com","010-9999-9991"));
	cusList.add(new Customer("���2","big2@kosmo.com","010-9999-9992"));
	cusList.add(new Customer("���3","big3@kosmo.com","010-9999-9993"));
	request.setAttribute("cusList", cusList);
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
<hr>
<h2>�������� �����մϴ�.</h2>
<table style="width: 300px;">

<tr>
<th>��ȣ</th><th>�̸�</th><th>����</th><th>����ó</th>
</tr>

<c:forEach var="cus" items="${cusList }" varStatus="i">
<tr>
<td>${i.count }</td><td>${cus.name }</td><td>${cus.email }</td><td>${cus.phone }</td>
</tr>
</c:forEach>
</table>
</body>
</html>