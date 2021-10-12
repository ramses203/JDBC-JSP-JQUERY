<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<div>
	<form action="myprofileAdd4" method="post">
	<p> 이름 : <input type="text" name="name" id="name"></p>
	<p> 나이 : <input type="number" name="age" id="age"></p>
	<p> email : <input type="email" name="email" id="email"></p>
	<p> 성별 : <input type="radio" name="gender" id="gender" value="">남&nbsp;
	<input type="radio" name="gender" id="gender" value="f">여
	</p>
	<p> 차종 : <select name="cartype" id="cartype">
			<option value="대형">대형</option>
			<option value="중형">중형</option>
			<option value="소형">소형</option>
	</select>
	</p>
	<p>
		<input type="checkbox" name="cls" value="java">Java<br>
		<input type="checkbox" name="cls" value="Oracle">Oracle<br>
		<input type="checkbox" name="cls" value="Python">Python<br>
		<input type="checkbox" name="cls" value="Servlet">Servlet<br>
		<input type="checkbox" name="cls" value="Android">Android<br>
	</p>
	<p><input type="submit" value="send"> </p>
	
	</form>
</div>
</body>
</html>