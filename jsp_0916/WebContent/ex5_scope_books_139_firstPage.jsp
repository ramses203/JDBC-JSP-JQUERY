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
	pageContext.setAttribute("page", "pageContext�� ������ ��");
	request.setAttribute("req", "request�� ������ ��");
	session.setAttribute("sess", "session�� �����Ѱ�");
	application.setAttribute("app", "application�� �����Ѱ�");
	
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
<a href="ex5_second.jsp">�̵�</a>

</body>
</html>