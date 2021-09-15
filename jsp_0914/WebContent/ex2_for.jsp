<%@page import="ex1.model.Ex2ForModel"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	
	int sv = Integer.parseInt(request.getParameter("s"));
	
	int nv = Integer.parseInt(request.getParameter("n"));
	
	int sum = Ex2ForModel.getInstance().forSum(sv, nv);

%>


<p>
1부터 n까지의 합은 <%=sum %>입니다.
</p>
</body>
</html>