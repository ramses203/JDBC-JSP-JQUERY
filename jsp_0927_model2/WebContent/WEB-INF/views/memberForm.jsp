<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="head.jsp" %>
<div id="content">
<h2> MemberForm </h2>
<div style="width: 450px; margin: auto">

<form action="" method="post">
		<p>
			아이디 : <input type="text" name="id" id="id">&nbsp;
			<input type="button" id="btn" value="중복확인" onclick="idCheck()">
			<div style="display: none;" id="target"></div>
		</p>
			<p>비밀번호 : <input type="text" name="pwd" id="pwd">
		</p>
			<p>이름 : <input type="text" name="name" id="name">
		</p>
			<p>나이 : <input type="number" name="age" id="age" value="10">
		</p>
			<p>이메일  : <input type="text" name="email" id="email">
		</p>
			<p><input type="submit" value="가입">
		</p>
	</form>
	</div>
</div>
</div>
</body>
</html>