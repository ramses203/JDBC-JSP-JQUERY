<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="sun.security.jca.GetInstance"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
// getInstance()�� ȣ���ؼ� ������ Calendar�� ��ȯ
	Calendar cal1 = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
	System.out.print(cal1);
	System.out.print(cal2);
%>
<%=cal1.get(Calendar.YEAR) %>��
<%=cal1.get(Calendar.MONTH)+1 %>��
<%=cal1.get(Calendar.DATE) %>��
<hr>
<%
SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
%>
<%=f.format(new Date()) %>

</body>
</html>