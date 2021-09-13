<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3_check.jsp</title>
</head>
<body>

	<%
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String[] fruit = request.getParameterValues("fruit");
	%>
	<ul>
	<li><%=gender %></li>	
	<li><%=phone %></li>
	<%for(String e : fruit){%>
	<li><%=e %></li>
	<% } %>
	</ul>
	
</body>
</html>