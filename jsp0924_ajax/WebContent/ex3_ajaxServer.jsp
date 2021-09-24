<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String subject = request.getParameter("subject");
	if(subject.equals("java")){
		out.println("자바 복습!");
	} else if(subject.equals("oracle")){
		out.println("오라클 서브쿼리 복습!");
	} else if(subject.equals("jsp")){
		out.println("jsp 복습");
	} else {
		out.println("복습");
	}

%>