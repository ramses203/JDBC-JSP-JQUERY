<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li><%=pageContext.getAttribute("page") %></li>
	<li><%=request.getAttribute("req") %></li>
	<li><%=session.getAttribute("sess") %></li>
	<li><%=application.getAttribute("app") %></li>
</ul>
</body>
</html>