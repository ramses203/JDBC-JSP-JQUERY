<%@page import="dto.Member2DTO"%>
<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	request.setCharacterEncoding("euc-kr");
	// 1) ������ ���۵Ǿ� ���� �Ķ���Ͱ��� �޾Ƽ� DTO�� �����Ѵ�.
	Member2DTO vo = new Member2DTO();
	vo.setId(request.getParameter("id"));
	vo.setPwd(request.getParameter("pwd"));
	vo.setName(request.getParameter("name"));
	vo.setAge(Integer.parseInt(request.getParameter("age")));
	vo.setEmail(request.getParameter("email"));
	
	// 2) Dao�� �̱������� ���� �� ���ϴ� �޼��带 ȣ��
	Member2Dao.getDao().insertMember(vo);
	response.sendRedirect("memberList.jsp");
%>