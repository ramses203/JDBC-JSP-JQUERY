<%@page import="dto.MemoDTO"%>
<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("euc-kr");
// �Ķ���͸� �޾Ƽ� DTO�� �������� ���ּҰ� vo�� Dao�� addMemo()�� ���ڷ� �����Ѵ�. 
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