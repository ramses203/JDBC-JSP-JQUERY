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
		request.setCharacterEncoding("euc-kr");	
		String msg = request.getParameter("msg");
		int num = Integer.parseInt(request.getParameter("num"));
		
	%>
	<ul>
		<li><%=msg %></li>
	</ul>
	<hr>
	<table style="width: 100px; border: 1px solid;" >
	<% for(int i=0; i<num; i++){
		if(i % 2 == 0) {
		%>
		<tr style="background-color: orange;">
		<td><%=i %></td>
		</tr>
		<% } else {%>
		<tr style="background-color: yellow;">
		<td><%=i %></td>
		</tr>
		<%
		}
	}
		%>
	</table>
</body>
</html>