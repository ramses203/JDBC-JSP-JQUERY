<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p>A page1</p>
<%-- <jsp:include page="b.jsp"/> --%>
<%
	int num = 10;
%>
<jsp:include page="b.jsp"/><!--****** include�׼��±׿� include������ �±��� ��������  -->


<%--@include file="b.jsp" --%><!-- include�� b.jsp�� ���Խ��Ѽ� a.jsp�������� �����д�. -->
</body>
</html>

