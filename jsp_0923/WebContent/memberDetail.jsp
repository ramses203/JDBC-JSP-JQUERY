<%@page import="java.util.List"%>
<%@page import="dto.Member2DTO"%>
<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 500px; margin: auto">
		<table>
			<tr>
				<th>num</th>
				<th>id</th>
				<th>name</th>
				<th>mdate</th>
			</tr>
<%
	//Dao를 생성해서 
	int num = Integer.parseInt(request.getParameter("num"));
	Member2DTO vo = Member2Dao.getDao().detail(num);
%>
			<tr>
				<th><%=vo.getNum() %></th>
				<th><%=vo.getId() %></th>
				<th><%=vo.getName() %></th>
				<th><%=vo.getMdate() %></th>
			</tr>
		
	</table>
	<a href="memberList.jsp"><input type="button" value="리스트"></a> 
	</div>
	
	
</body>
</html>