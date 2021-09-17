<%@page import="dao.MemoDAO"%>
<%@page import="dto.MemoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="conn.Myconn"%>
<%@page import="java.sql.Connection"%>
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
ArrayList<MemoDTO> arr = MemoDAO.getDao().arrDTO();
for(MemoDTO e : arr){
%>

<p>

<%=e.getNum() %>
<%=e.getMcount() %>
<a href="detail.jsp?num=<%=e.getNum() %>"> <%=e.getMwrite() %></a>
<%=e.getMip() %>
<%=e.getMdate() %>

</p>
<% } %>
</body>
</html>