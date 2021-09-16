<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<% 
	Enumeration<String> headerEnum = request.getHeaderNames();
	while(headerEnum.hasMoreElements()) {
		String headerName = (String)headerEnum.nextElement();
		String headerValue = request.getHeader(headerName);
%>

	<%= headerName %> = <%= headerValue %> <br>
<%
	}
%>
<hr>

<%  // 파라미터의 이름을 알고싶을때 사용한다. 
	
	Enumeration<String> params = request.getParameterNames();
	while(params.hasMoreElements()){
		String param_name = params.nextElement().toString();
%>
	<%=param_name %>
<%
	}
%>
<br>
<%
	
	Map<String, String[]> paramMap = request.getParameterMap();
	String[] nameParam = paramMap.get("name");
	if(nameParam != null) {
%>
name = <%=nameParam[0] %>
<%
	}
%>
</body>
</html>