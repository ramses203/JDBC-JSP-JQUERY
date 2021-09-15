<%@page import="java.util.ArrayList"%>
<%@page import="ex1.model.Ex5_PetModel"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex5_list.jsp</title>
</head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>

<body>
<div style="width: 450px; margin: auto">
<%
	ArrayList<String> arlist = Ex5_PetModel.getModel().listgetFile();

%>
<h2><%=arlist.size() %>명이 등록 함.</h2>

<table id="customers">
	<tr>
		<th>이름</th>
		<th>주소</th>
		<th>선호팻</th>
	</tr>
	
<%
// 팅별 과제 : 오늘 학습한 내용으로 업데이트 - valueObjectDemo code 를 참조
for(String e : arlist){ 
	String[] tdate = e.split(":");
%>
	<tr>
		<td><%= tdate[0]%></td>
		<td><%= tdate[1]%></td>
		<td>
		<%
		String[] pets = tdate[2].split("/");
		for(String f : pets){
	%>
		<img src="resources/img/<%=f %>.jpg" style="width: 100px; height: 70px;">
	
		<%
		}
		%>
		</td>
	</tr>
<%
} 
%>
</table>
<a href="ex5_form.jsp">글작성</a>
</div>
</body>
</html>