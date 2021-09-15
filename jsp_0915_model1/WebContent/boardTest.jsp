<%@page import="java.util.ArrayList"%>
<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// insert test
	BoardDao dao = BoardDao.getDao();
	BoardDTO vo = new BoardDTO();
	vo.setWriter("강감찬");
	vo.setTitle("곧 점심시간입니다.");
	vo.setContent("성공 했습니다.");
	vo.setPwd("112");
	dao.insert(vo);
	// select test
	ArrayList<BoardDTO> list = dao.list();
	for(BoardDTO e: list){
%>
	<%=e.getWriter()%>
	<%=e.getTitle()%>
	<%=e.getRegdate()%><br>
<%
}
%>	