<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String subject = request.getParameter("subject");
	if(subject.equals("java")){
		out.println("�ڹ� ����!");
	} else if(subject.equals("oracle")){
		out.println("����Ŭ �������� ����!");
	} else if(subject.equals("jsp")){
		out.println("jsp ����");
	} else {
		out.println("����");
	}

%>