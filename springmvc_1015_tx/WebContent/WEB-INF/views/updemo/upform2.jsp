<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform2.jsp</title>
</head>
<body>

	<fieldset>
		<legend>���� ���ε� ����</legend>
		<form action="upload3" method="post" enctype="multipart/form-data">
				���̵� : <input type="text" name="id" value="xman2"><br>
				�̸� : <input type="text" name="uname" value="ȣȣȣ"><br>
				���� :<input type="number" name="age" step="1" max="150" value="20"><br>
				<input type="number" id="code" value="1" min="1" step="1" 
				onchange="addFile()" max="5">
				<div id="target">
				<div>�̹��� ����:
				<input type="file" name="mfile2" id="mfile2">
				</div>
				</div>
			</div>
			<p>
				<input type="submit" value="send">
			</p>
		</form>
	</fieldset>
	<script>
		function addFile() {
			var code = parseInt(document.getElementById("code").value,"10");
			console.log(code);
			var html = "";
			for(var i=0; i<code; i++){
				html += "<input type=\"file\" name=\"mfile2\" id=\"mfile2\"><br>";
			}
			document.getElementById("target").innerHTML=html;
		}
	
	</script>
</body>
</html>