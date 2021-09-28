<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="head.jsp" %>


<title>Login Page</title>
</head>
<body>
<div id="content">
<h2> Login 화면입니다. </h2>
</div>
<div>
<div>
<form action="" method="post">
	<table border="1">
<tr>
   <th colspan="2">로그인</th>
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
   <th colspan="2"><input type="submit" value="확인">
   <input type="reset" value="취소">
   </th>
</tr>
</table>

</form>
</div>
</div>
</body>
</html>