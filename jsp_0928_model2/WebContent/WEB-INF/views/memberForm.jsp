<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="head.jsp" %>
<title>Login Page</title>
</head>
<body>
<div id="content">
<h2> 회원가입 화면입니다. </h2>
</div>
<div>
<div>
<form action="" method="post">
	<table border="1">
<tr>
   <th colspan="2">회원가입</th>
</tr>
<tr>
   <td>아이디</td>
   <td><input type="text" name="id"></td>
</tr>
<tr>
   <td>비밀번호</td>
   <td><input type="text" name="pwd"></td>
</tr>
<tr>
   <td>이메일</td>
   <td><input type="text" name="email"></td>
</tr>
<tr>
   <td>전화번호</td>
   <td><input type="tel" name="tel"></td>
</tr>


<tr>
   <th colspan="2"><input type="submit" value="등록">
   <input type="reset" value="취소">
   </th>
</tr>
</table>

</form>
</div>
</div>

</body>
</html>