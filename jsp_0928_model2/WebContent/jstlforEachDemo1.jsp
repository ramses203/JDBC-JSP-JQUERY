<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table style="width: 300px;">
<c:forEach begin="1" end="10" step="1" varStatus="i">
<tr>
<td style="border: 1px dotted;">${i.count }/${i.index }</td>
</tr>
</c:forEach>
</table>
</body>
</html>