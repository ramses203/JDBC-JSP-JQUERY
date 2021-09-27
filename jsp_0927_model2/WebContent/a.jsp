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
<jsp:include page="b.jsp"/><!--****** include액션태그와 include지시자 태그의 차이점은  -->


<%--@include file="b.jsp" --%><!-- include는 b.jsp를 포함시켜서 a.jsp페이지에 보여둔다. -->
</body>
</html>

