<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현부</title>
</head>
<body>
<%
 	// 지역변수
	String msg = "hello";
	//PrintWritter는 내부적으로 생성해서 돌려중.
	//out.println(msg);
%>

<h1><%=msg %></h1>
</body>
</html>