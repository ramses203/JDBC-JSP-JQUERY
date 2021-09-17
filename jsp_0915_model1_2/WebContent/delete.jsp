<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	int no = Integer.parseInt(request.getParameter("no"));
	BoardDao.getDao().delete(no);
	response.sendRedirect("list.jsp");
%>
