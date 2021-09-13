<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="ex3_check.jsp" method="post">
성별 : <input type="radio" name="gender" id="gender"
value="남자">남자
<input type="radio" name="gender" id="gender"
value="여자">여자 <br>
<%-- name하나고 value로 선택된 값이 전송 --%>
전화번호 :
<select name="phone">
<option value="">선택</option>
<option value="02">02</option>
<option value="032">032</option>
<option value="031">031</option>
</select>
<hr>
<%-- name의 이름이 동일하고 value로 선택된 값들이 전송 --%>
과일 :
<input type="checkbox" name="fruit" value="1">사과
<input type="checkbox" name="fruit" value="2">배
<input type="checkbox" name="fruit" value="3">오렌지
<input type="checkbox" name="fruit" value="4">키위
<input type="checkbox" name="fruit" value="5">바나나
<br>
<input type="submit" value="전송">
</form>
</body>
</html>