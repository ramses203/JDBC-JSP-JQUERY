<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
Ŭ���̾�ƮIP * =<%request.getRemoteAddr(); %>
��û�������� * =<%request.getContentLength(); %>
��û���� ���ڵ� =<%request.getCharacterEncoding(); %>
��û���� ������Ÿ��*=<%request.getContentType(); %>
��û���� ��������=<%request.getProtocol(); %>
��û���� ���۹�� *=<%request.getMethod(); %>
��û URI=<%request.getRequestURI(); %>
���ؽ�Ʈ ��� * =<%request.getContextPath(); %>
�����̸� =<%request.getServerName(); %>
������Ʈ  =<%request.getServerPort(); %>

</body>
</html>