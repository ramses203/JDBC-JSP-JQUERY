<%@page import="dto.MemoDTO"%>
<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("euc-kr");
// 파라미터를 받아서 DTO에 저장한후 그주소값 vo를 Dao에 addMemo()의 인자로 전달한다. 
MemoDAO dao = MemoDAO.getDao();
/*MemoDTO vo = new MemoDTO();
vo.setMcount(request.getParameter("mcount"));
vo.setMwrite(request.getParameter("mwrite"));
vo.setMip(request.getParameter("mip"));
dao.addMemo(vo); */
%>
<jsp:useBean id="vo" class="dto.MemoDTO"/>
<jsp:setProperty property="*" name="vo"/>
<%
dao.addMemo(vo);
response.sendRedirect("select_test.jsp");
%>