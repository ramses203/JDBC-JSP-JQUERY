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
	// jdk 7���� ��밡��: autoclose 
	try(InputStreamReader fr = new InputStreamReader(new FileInputStream(filePath),
			"euc-kr")) {
		while( (len = fr.read(buff)) != -1){
			out.println(new String(buff, 0, len));
		}
	} catch(IOException ex) {
		out.println("�ͼ��� �߻�: " + ex.getMessage());
	}
--%>

<%
// InputStreamReader �긴�� ��Ʈ�� : �����Ҷ��� ����Ѵ�. 
// ��ġ�� �ڿ��� ��¿ �� ���� ����Ʈ ��Ʈ������ ���ڸ� ��ȯ�Ҷ� 
// ����Ʈ/ ���ڽ�Ʈ�� �����Ҽ��ִ�. - ������ǥ

%>
</body>
</html>