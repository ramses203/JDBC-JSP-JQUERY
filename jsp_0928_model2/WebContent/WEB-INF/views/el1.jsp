<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="head.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>이름: ${cutomer.name}</li>
	<li>Email: ${cutomer.email}</li>
	<li>Phone: ${cutomer.phone}</li>
</ul>
<ul>
	<li>차명: ${car.carname}</li>
	<li>제조사: ${car.carMaker}</li>
</ul>

</body>
</html>