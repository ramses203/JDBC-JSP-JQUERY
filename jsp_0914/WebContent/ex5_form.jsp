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
<form action="ex5_param.jsp" method="post">
이름: <input type="text" name="name"><br>
주소:<input type="text" name="address"><br>
좋아하는 동물:
<input type="checkbox" name="pet" value="1">강아지
<input type="checkbox" name="pet" value="2">고양이
<input type="checkbox" name="pet" value="3">돼지
<br>
<input type="submit" value="전송">
</form>
</div>

</body>
</html>