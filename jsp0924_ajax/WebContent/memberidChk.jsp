<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- ������ ������ �����ϴ� �������±׼Ӽ� -->
<%@page trimDirectiveWhitespaces="true" %>
<%
	//request.setCharacterEncoding("euc-kr"); �̰� ��� �ɰͰ��ٰ� ������� �����Ͻ�
	String id =  request.getParameter("idv");
	//Dao�� public int memberId(String id)
	int res = Member2Dao.getDao().memberId(id);

%><%=res %>