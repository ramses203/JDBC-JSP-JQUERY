<%@page import="exam.Customer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%
	Customer cus = new Customer();
	request.setAttribute("cus", cus);
 %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- c:set태그에서 var, target 속성을 동시에 사용할수 없다.
	value의 값이 null인경우에는 var속성은 사라진다.
	target에는 실제 존재하는 개체를 표현하는 표현식(bean,map)이 들어와야 한다.
	c:remove태그는 var에 명시한 scope의 이름을 해당 scope속성에서 삭제한다.
	  --%>
<%--<c:remove var="cus" scope="requst"/> --%>


<c:set target="${cus}" property="name" value="홍길동"/>
<c:set target="${cus}" property="email">test@test.com</c:set>
<!-- *** : 현재 Viewㅠㅔ이지에서 새로운 변수를 선언하고 값을 저장하면 ${} -->
<c:set var="myphone" value="010-888-8888"/>
<p>${myphone }</p>
<c:set target="${cus }" property="phone" value="${myphone }"/>
<ul>
	<li>이름: ${cus.name}</li>
	<li>메일: ${cus.email}</li>
	<li>전화: ${cus.phone}</li>
</ul>
</body>
</html>