<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="ex7_useBeanDemo.jsp" method="post">
	<p>
	아이디 : <input type="text" name="id" id="id"> &nbsp;
	<input type="button" id="btn" value="중복확인">
	<div style="display: none;">xxxxx</div>
	</p>
	<p>
	비밀번호 : <input type="text" name="pwd" id="pwd">
	</p>
	<p>
	이름 : <input type="text" name="name" id="namae">
	</p>
	<p>
	나이 : <input type="text" name="age" id="age">
	</p>
	<p>
	전화번호 : 
	<select name="tel1">
		<option value="02">서울</option>
		<option value="031">경기</option>
		<option value="032">인천</option>
	</select>
	<input type="text" name="tel2" id="tel2" maxlength="5">
	<input type="text" name="tel3" id="tel3" maxlength="5">
	</p>
	<input type="submit" value="가입">
	
</form>
</body>
</html>