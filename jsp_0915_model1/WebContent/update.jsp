<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	// insert test
	BoardDao dao = BoardDao.getDao();
	BoardDTO vo = new BoardDTO();
	vo.setNo(Integer.parseInt(request.getParameter("no")));
	vo.setWriter(request.getParameter("writer"));
	vo.setTitle(request.getParameter("title"));
	vo.setContent(request.getParameter("content"));
	vo.setPwd(request.getParameter("pwd"));
	dao.update(vo);
	
	response.sendRedirect("info.jsp?no="+vo.getNo());

%>