<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="head.jsp" %>
<div id="content">
<h2> MemberForm </h2>
<div style="width: 450px; margin: auto">

<form action="" method="post">
		<p>
			���̵� : <input type="text" name="id" id="id">&nbsp;
			<input type="button" id="btn" value="�ߺ�Ȯ��" onclick="idCheck()">
			<div style="display: none;" id="target"></div>
		</p>
			<p>��й�ȣ : <input type="text" name="pwd" id="pwd">
		</p>
			<p>�̸� : <input type="text" name="name" id="name">
		</p>
			<p>���� : <input type="number" name="age" id="age" value="10">
		</p>
			<p>�̸���  : <input type="text" name="email" id="email">
		</p>
			<p><input type="submit" value="����">
		</p>
	</form>
	</div>
</div>
</div>
</body>
</html>