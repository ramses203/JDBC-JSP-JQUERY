<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
<style>
	/* css������ �ּ�
	E : element ���
	id :  id�Ӽ� => �ݵ�� �������������� �����ؾ� �Ѵ�. #���̵�
	class : class�Ӽ� , ������������ �ߺ�����, �ϳ� �̻��� ���� �� �� �ִ�. .Ŭ����
	[E,#id,.class, �ڽ� > ,�θ� �ļ� , �̿����] {   css���� ��) color:"red"; size:200px;  }
	*/
	#content { width: 100%;}
	#content table {  width: 350px; margin: auto}
	#content table, td, th {
		border: 1px solid black;
	}
	#content table {
		width: 100%;
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div id="wrap">
<div id="navigation">
<ul>
	<li><a href="index.jsp">Home</a></li>
	<li><a href="main.kosmo?cmd=loginForm">�α���</a></li>
	<li><a href="main.kosmo?cmd=memberForm">ȸ������</a></li>
	<li><a href="main.kosmo?cmd=board&viewName=write">�Խ���</a></li>
	<li><a href="main.kosmo?cmd=board&viewName=list">������</a></li>
	<li><a href="main.kosmo?cmd=vfname&viewName=el1form">EL����1</a></li>
</ul>
</div>
<div id="bgx"></div>

