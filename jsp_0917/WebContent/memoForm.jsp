<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#box {
width: 200px;
height: 50px;
}

</style>

</head>
<body>
<form action="insertTest.jsp" method="post">
<p>
작성자 : <input type="text" id="mwrite" name="mwrite">
</p>
<p>
내용 : <textarea rows="50" cols="50" id="mcount" name="mcount" 
style="height: 200px" placeholder="내용을 입력하세요..."></textarea>
</p>
<p>
<input type="hidden" id="mip" name="mip" value="<%=request.getRemoteAddr()%>">
</p>
<p>
<input type="submit" value="submit" id="btn" name="mwrite">
</p>
</form>
</body>
</html>