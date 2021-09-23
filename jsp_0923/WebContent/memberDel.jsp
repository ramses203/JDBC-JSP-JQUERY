<%@page import="dao.Member2Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
int num = Integer.parseInt(request.getParameter("num"));
Member2Dao.getDao().delMember(num);
response.sendRedirect("memberList.jsp");

%>
