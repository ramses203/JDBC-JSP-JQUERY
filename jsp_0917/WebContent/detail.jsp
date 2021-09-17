<%@page import="dao.MemoDAO"%>
<%@page import="dto.MemoDTO"%>
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
int num = Integer.parseInt(request.getParameter("num"));
MemoDTO vo = MemoDAO.getDao().detail(num);
%>
<%=vo.getNum() %>
<%=vo.getMcount() %>
<%=vo.getMwrite() %>
<%=vo.getMdate() %>
</body>
</html>