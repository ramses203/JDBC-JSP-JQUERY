<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<legend>파일 업로드 예제</legend>
	<form action="upload2" method="post" enctype="multipart/form-data">
		<div id="target">
		아이디 :  <input type="text" name="id" value="xman2"><br>
    	   이름  :  <input type="text" name="uname" value="호호호"><br>
   		 나이 :<input type="number" name="age" step="1" max="150" value="20"><br>
		<div>
		이미지 파일 : <input type="file" name="mfile" id="mfile">
		</div>
		</div>
		<p>
			<input type="submit" value="send">
		</p>
	
	</form>
</fieldset>
</body>
</html>