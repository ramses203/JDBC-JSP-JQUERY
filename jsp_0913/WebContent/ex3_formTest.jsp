<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex_formTest.jsp</title>
</head>
<body>

	<div style="width: 200px; margin: auto;">
		<form action="ex3_formProcess.jsp" method="post">
			메세지 입력 : <input type="text" name="msg" id="msg"><br> 
			숫자 입력 : <input type="number" name="num" value="5" step="1"><br> 
			<input type="submit" value="send">
		</form>
	</div>

</body>
</html>