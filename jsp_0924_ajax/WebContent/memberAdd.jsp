<%@page import="dto.Member2DTO"%>
<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
	request.setCharacterEncoding("euc-kr");
	// 1) 폼에서 전송되어 오는 파라미터값을 받아서 DTO에 저장한다.
	Member2DTO vo = new Member2DTO();
	vo.setId(request.getParameter("id"));
	vo.setPwd(request.getParameter("pwd"));
	vo.setName(request.getParameter("name"));
	vo.setAge(Integer.parseInt(request.getParameter("age")));
	vo.setEmail(request.getParameter("email"));
	
	// 2) Dao를 싱글톤으로 생성 후 원하는 메서드를 호출
	Member2Dao.getDao().insertMember(vo);
	response.sendRedirect("memberList.jsp");
%>