<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="ex3_check.jsp" method="post">
���� : <input type="radio" name="gender" id="gender"
value="����">����
<input type="radio" name="gender" id="gender"
value="����">���� <br>
<%-- name�ϳ��� value�� ���õ� ���� ���� --%>
��ȭ��ȣ :
<select name="phone">
<option value="">����</option>
<option value="02">02</option>
<option value="032">032</option>
<option value="031">031</option>
</select>
<hr>
<%-- name�� �̸��� �����ϰ� value�� ���õ� ������ ���� --%>
���� :
<input type="checkbox" name="fruit" value="1">���
<input type="checkbox" name="fruit" value="2">��
<input type="checkbox" name="fruit" value="3">������
<input type="checkbox" name="fruit" value="4">Ű��
<input type="checkbox" name="fruit" value="5">�ٳ���
<br>
<input type="submit" value="����">
</form>
</body>
</html>