<%@page import="java.net.URL"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.InputStreamReader"%>
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
	//String resourcePath = "/WEB-INF/message/notice.txt";
	char[] buff = new char[128];
	int len = -1;
	URL url = new URL("http://localhost:9100/jsp_0916/message/notice.txt");
	try (InputStreamReader br = new InputStreamReader(url.openStream(), "euc-kr")){
		while ( (len = br.read(buff)) != -1) {
		out.println(new String(buff, 0, len));
		}
	} catch(IOException ex) {	
		out.println("익셉션 발생 : " + ex.getMessage());
	}
%>

</body>
</html>