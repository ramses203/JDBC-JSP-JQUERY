<%@page import="ex1.model.Ex5_PetModel"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	// 한글 처리
	request.setCharacterEncoding("euc-kr");
	
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String[] pet = request.getParameterValues("pet");
	Ex5_PetModel model = Ex5_PetModel.getModel();
	
	model.insertPetFile(name, address, pet);

	response.sendRedirect("ex5_list.jsp");
%>
