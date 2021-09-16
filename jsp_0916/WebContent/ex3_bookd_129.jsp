<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.InputStream"%>
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
String rPath = "/WEB-INF/message/notice.txt";
%>
<%=application.getRealPath(rPath) %>
<%
	InputStream input = application.getResourceAsStream(rPath);
%>
<%
// 1) Scanner rd2 = new Scanner(input);
// 2) 
BufferedReader rd = new BufferedReader(new InputStreamReader(input));
String res = null;
while ((res = rd.readLine()) != null){
	System.out.println(res);
}
%>


<%
//BufferedReader rd = new BufferedReader(new FileReader(filePath));
//String res = null;
//while ((res = rd.readLine()) != null) {
//	System.out.println(res);
	
%>
</body>
</html>