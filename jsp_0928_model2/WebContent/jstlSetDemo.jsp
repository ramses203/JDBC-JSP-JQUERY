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
<%-- c:set�±׿��� var, target �Ӽ��� ���ÿ� ����Ҽ� ����.
	value�� ���� null�ΰ�쿡�� var�Ӽ��� �������.
	target���� ���� �����ϴ� ��ü�� ǥ���ϴ� ǥ����(bean,map)�� ���;� �Ѵ�.
	c:remove�±״� var�� ����� scope�� �̸��� �ش� scope�Ӽ����� �����Ѵ�.
	  --%>
<%--<c:remove var="cus" scope="requst"/> --%>


<c:set target="${cus}" property="name" value="ȫ�浿"/>
<c:set target="${cus}" property="email">test@test.com</c:set>
<!-- *** : ���� View�Ф��������� ���ο� ������ �����ϰ� ���� �����ϸ� ${} -->
<c:set var="myphone" value="010-888-8888"/>
<p>${myphone }</p>
<c:set target="${cus }" property="phone" value="${myphone }"/>
<ul>
	<li>�̸�: ${cus.name}</li>
	<li>����: ${cus.email}</li>
	<li>��ȭ: ${cus.phone}</li>
</ul>
</body>
</html>