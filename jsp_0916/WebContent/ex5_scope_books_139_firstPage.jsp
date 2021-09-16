<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex5_scope_139_firstPage</title>
</head>
<body>
<%
	pageContext.setAttribute("page", "pageContext에 저장한 값");
	request.setAttribute("req", "request에 저장한 값");
	session.setAttribute("sess", "session에 저장한값");
	application.setAttribute("app", "application에 저장한값");
	
	//forward*****
//	RequestDispatcher rd = request.getRequestDispatcher("ex5_second.jsp");
//	rd.forward(request, response);

%>
<jsp:forward page ="ex5_second.jsp"/>
<ul>
	<li>pageContext: <%=pageContext.getAttribute("page") %></li>
	<li>request: <%=request.getAttribute("req") %></li>
	<li>session: <%=session.getAttribute("sess") %></li>
	<li>application: <%=application.getAttribute("app") %></li>
</ul>
<a href="ex5_second.jsp">이동</a>

</body>
</html>