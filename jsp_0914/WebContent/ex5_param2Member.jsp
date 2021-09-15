<%@page import="b_0914.Ex5_MemberList"%>
<%@page import="b_0914.B_MemberDTO"%>
<%@page import="ex1.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	// 한글 처리
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String[] pet = request.getParameterValues("pet");
	B_MemberDTO member = new B_MemberDTO();
	member.setName(name);
	member.setAddress(address);
	member.setPets(pet);
	Ex5_MemberList memberList = Ex5_MemberList.getInstance();
	memberList.getPetListFile();
	response.sendRedirect("Ex5_MemberList");
	
	

%>
