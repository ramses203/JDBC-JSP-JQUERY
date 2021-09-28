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
	/* css에서의 주석
	E : element 요소
	id :  id속성 => 반드시 한페이지에서는 유일해야 한다. #아이디
	class : class속성 , 한페이지에서 중복가능, 하나 이상을 설정 할 수 있다. .클래스
	[E,#id,.class, 자식 > ,부모 후손 , 이웃요소] {   css문법 예) color:"red"; size:200px;  }
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
	<li><a href="main.kosmo?cmd=loginForm">로그인</a></li>
	<li><a href="main.kosmo?cmd=memberForm">회원가입</a></li>
	<li><a href="main.kosmo?cmd=board&viewName=write">게시판</a></li>
	<li><a href="main.kosmo?cmd=board&viewName=list">갤러리</a></li>
	<li><a href="main.kosmo?cmd=vfname&viewName=el1form">EL예제1</a></li>
</ul>
</div>
<div id="bgx"></div>

