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
    vo.setPwd(request.getParameter("pwd"));
    vo.setNo(Integer.parseInt(request.getParameter("no")));
    dao.update(vo);
    
    response.sendRedirect("info.jsp?no="+vo.getNo());
    %>