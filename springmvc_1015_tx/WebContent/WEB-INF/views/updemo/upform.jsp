<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform.jsp</title>
</head>
<body>

	<fieldset>
		<legend>���� ���ε� ����</legend>
		<form action="upload2" method="post" enctype="multipart/form-data">
			<div id="target">
				���̵� : <input type="text" name="id" value="xman2"><br>
				�̸� : <input type="text" name="uname" value="ȣȣȣ"><br>
				���� :<input type="number" name="age" step="1" max="150" value="20"><br>
				<div>�̹��� ����:<input type="file" name="mfile" id="mfile"></div>
			</div>
			<p>
				<input type="submit" value="send">
			</p>
		</form>
	</fieldset>
</body>
</html>