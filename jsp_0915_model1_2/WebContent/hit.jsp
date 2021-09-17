<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao.getDao().hit(no);
	response.sendRedirect("info.jsp?no="+no);
%>