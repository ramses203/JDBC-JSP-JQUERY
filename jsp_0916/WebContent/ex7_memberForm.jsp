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
	���̵� : <input type="text" name="id" id="id"> &nbsp;
	<input type="button" id="btn" value="�ߺ�Ȯ��">
	<div style="display: none;">xxxxx</div>
	</p>
	<p>
	��й�ȣ : <input type="text" name="pwd" id="pwd">
	</p>
	<p>
	�̸� : <input type="text" name="name" id="namae">
	</p>
	<p>
	���� : <input type="text" name="age" id="age">
	</p>
	<p>
	��ȭ��ȣ : 
	<select name="tel1">
		<option value="02">����</option>
		<option value="031">���</option>
		<option value="032">��õ</option>
	</select>
	<input type="text" name="tel2" id="tel2" maxlength="5">
	<input type="text" name="tel3" id="tel3" maxlength="5">
	</p>
	<input type="submit" value="����">
	
</form>
</body>
</html>