<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp"%>
<div id="content">
<div style="width: 450px; margin: auto" >
	<form action="main.kosmo" method="post">
		<input type="hidden" name="cmd" value="member"> <input
			type="hidden" name="viewName" value="memberIn">
		<p>
			���̵� : <input type="text" name="id" id="id">&nbsp; <input
				type="button" id="btn" value="�ߺ�Ȯ��" onclick="idCheck()">
		<div style="display: none;" id="target"></div>
		</p>
		<p>
			��й�ȣ : <input type="text" name="pwd" id="pwd">
		</p>
		<p>
			�̸� : <input type="text" name="name" id="name">
		</p>
		<p>
			���� : <input type="number" name="age" id="age" value="10">
		</p>
		<p>
			�̸��� : <input type="text" name="email" id="email">
		</p>
		<p>
			<input type="submit" value="����">
		</p>
	</form>
</div>
</div>

</div>
<script>
	function idCheck() {//2 click
		// �Ķ���� �ޱ� 
		var id = document.getElementById("id").value;
		// client ------�񵿱������-------> Server  
		var param = "idv=" + id;
		// ��������  callback�Լ��� �̸��� ���� 
		myXhr.onreadystatechange = res;
		myXhr.open("post", "main.kosmo?cmd=member&viewName=memberIdChk");
		myXhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=euc-kr");
		myXhr.send(param); //GET -> send();
	}
	// �������� �����͸� ���� �Լ��� ���� 
	function res() { // 3 ���� ���ٰ� 
		if (myXhr.readyState === 4) {
			if (myXhr.status === 200) {
				console.log(myXhr.status);
				console.log(myXhr.responseText);
				var txt = myXhr.responseText;
				var resMsg = "";
				console.log(typeof (txt));
				if (txt === "1") {
					resMsg = "<p style='color:red'>�̹� ������Դϴ�.</p>";
				} else {
					resMsg = "<p style='color:blue'>��� ������ ���̵� �Դϴ�.</p>";
				}
				document.getElementById("target").style.display = 'block';
				document.getElementById("target").innerHTML = resMsg;
			}
		}
	}
</script>

</body>
</html>















