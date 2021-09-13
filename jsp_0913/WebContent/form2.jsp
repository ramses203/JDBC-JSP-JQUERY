<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form2.html</title>
</head>
<body>
<!-- get 방식으로 요청을 할때 
	form2.jsp?ch=1 or form2.jsp?ch=2 
	-->
	<h1>숫자를 선택하세요</h1>
<%
	// form2_jsp 서블릿에서 service(HttpServletRequest request, HttpServletResponse response){
	String ch = request.getParameter("ch");
	if(ch.equals("1")) {
%>	
	
	<form method="post" action="ex2formdemo">
		<input type="hidden" name="mode" value="res1"> <select
			name="num" id="num">
			<option value="10">10</option>
			<option value="20">20</option>
			<option value="30">30</option>
		</select> <input type="submit" value="send">
	</form>
<% } else if (ch.equals("2")){ 
%>


<hr>

	<form method="post" action="ex2formdemo">
		<input type="hidden" name="mode" value="res2"> 메시지 : <input
			type="text" name="msg"><br> <select name="num" id="num">
			<option value="10">10</option>
			<option value="20">20</option>
			<option value="30">30</option>
		</select> <input type="submit" value="send">

	</form>
	
	<% } %>
</body>
</html>