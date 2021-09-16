<%@page import="java.io.IOException"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="java.io.FileInputStream"%>
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
<%--
	char[] buff = new char[128];
	int len = -1;
	String filePath = "D:\\kosmo91\\jsp\\workspace\\jsp_0916\\WebContent\\WEB-INF\\message\\notice.txt";
	// jdk 7부터 사용가능: autoclose 
	try(InputStreamReader fr = new InputStreamReader(new FileInputStream(filePath),
			"euc-kr")) {
		while( (len = fr.read(buff)) != -1){
			out.println(new String(buff, 0, len));
		}
	} catch(IOException ex) {
		out.println("익셉션 발생: " + ex.getMessage());
	}
--%>

<%
// InputStreamReader 브릿지 스트림 : 연결할때나 사용한다. 
// 장치의 자원이 어쩔 수 없이 바이트 스트림으로 문자를 반환할때 
// 바이트/ 문자스트림 구분할수있다. - 복습목표

%>
</body>
</html>