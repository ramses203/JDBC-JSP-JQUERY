<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 멤버영역(선언부라고 부른다.) :  메서드를 정의, 멤버필드를 선언  -->
<%!
	private String msg;
	public void test(String msg){
		this.msg=msg;
	}
	//System.out.println("Test");
%>
<!-- 스크립트릿  -->
<%
	System.out.println("Test");
%>
<!-- service 메서드 영역 안  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1_script.jsp</title>
</head>
<body>



</body>
</html>