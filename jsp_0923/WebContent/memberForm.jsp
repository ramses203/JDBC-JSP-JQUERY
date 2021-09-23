<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 450px; margin: auto">
	<form action="memberAdd.jsp" method="post">
		<p>
			아이디 : <input type="text" name="id" id="id">&nbsp;
			<input type="button" id="btn" value="중복확인">
			<div style="display: none;"></div>
		</p>
			<p>비밀번호 : <input type="text" name="pwd" id="pwd">
		</p>
			<p>이름 : <input type="text" name="name" id="name">
		</p>
			<p>나이 : <input type="number" name="age" id="age" value="10">
		</p>
			<p>이메일  : <input type="text" name="email" id="email">
		</p>
			<p><input type="submit" value="가입">
		</p>
	</form>
</div>

</body>
</html>