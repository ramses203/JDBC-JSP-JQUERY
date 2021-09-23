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
	List<Member2DTO> list = Member2Dao.getDao().listMember();
	for(Member2DTO e : list){
		

%>			

			<tr>
				<th><%=e.getName() %></th>
				<th><a href="memberDetail.jsp?Num=<%=e.getNum() %>"><%=e.getNum() %></a></th>
				<th><%=e.getName() %></th>
				<th><a href="memberDel.jsp?Num=<%=e.getNum() %>">삭제</a></th>
			</tr>
		
<%} %>
	
		</table>
	</div>
</body>
</html>