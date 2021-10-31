<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>성열차트</title>
<link rel="shortcut icon" href="resources/img/logo.jpg">

 <!-- css -->
  <link href="resources/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="resources/css/ruang-admin.min.css" rel="stylesheet">
  <link href="resources/css/css_recommend.css" rel="stylesheet">
  <link href="resources/css/css_login.css" rel="stylesheet">
  <link href="resources/css/css_mypage.css" rel="stylesheet">
  <link href="resources/css/css_multisearch.css" rel="stylesheet">
  <link href="resources/css/css_userAdd.css" rel="stylesheet">
  <link href="resources/css/css_myfriend.css" rel="stylesheet">
  <link href="resources/css/css_login.css" rel="stylesheet"> 
  
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<div id="wrap">
		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="body"/>
		<tiles:insertAttribute name="footer"/>
	</div>
</body>
</html>








