<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	BoardDao dao = BoardDao.getDao();
	BoardDTO vo = new BoardDTO();
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setContent(request.getParameter("content"));
	vo.setContent(request.getParameter("pwd"));
	dao.insert(vo);
	
	response.sendRedirect("list.jsp");
%>