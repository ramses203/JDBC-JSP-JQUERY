<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- 페이지 공백을 제거하는 지시자태그속성 -->
<%@page trimDirectiveWhitespaces="true" %>
<%
	//request.setCharacterEncoding("euc-kr"); 이거 없어도 될것같다고 강사님이 말씀하심
	String id =  request.getParameter("idv");
	//Dao의 public int memberId(String id)
	int res = Member2Dao.getDao().memberId(id);

%><%=res %>