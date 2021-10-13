<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
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
<script src="resources/js/comm.js"></script>
</head>
<body>
<div style="width: 600px; margin: auto">
<table id="customers">
<tr>
<th>번호</th><th>제목</th><th>작성자</th><th>조회수</th><th>날짜</th>
</tr>



<c:forEach var="bvo" items="${blist }">

<tr>
<td>${bvo.no }</td>
<td>${bvo.title }</td>
<td>${bvo.writer }</td>
<td>${bvo.hit }</td>
<td>${bvo.regdate }</td>
</tr>

</c:forEach>

<tr><th colspan="5" style="text-align: right;">
<input type="button" value="글작성"  id="btn" onclick="goUrl('writer.jsp')">
</th></tr>
</table>
</div>
</body>
</html>