<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp"%>
<div id="content">
<div style="width: 450px; margin: auto" >
	<form action="memberIn" method="get">
		<input type="hidden" name="cmd" value="member"> <input
			type="hidden" name="viewName" value="memberIn">
		<p>
			���̵� : <input type="text" name="id" id="id">&nbsp; <input
				type="button" id="btn" value="�ߺ�Ȯ��">
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
// jQuery
$(function() {
	$('#btn').click(function() {
		var id = $('#id').val();
		// var obj = {"":"",ss:function(){}}
		$.ajax({
			url: "idcheck?id="+id,
			cache : false, //ajax �����  ĳ�÷� ����
			success:function(data){ // �ݹ�
				console.log("data: "+data);
				var resMsg = "";
				if (data === "1") {
					resMsg = "<p style='color:red'>�̹� ������Դϴ�.</p>";
				} else {
					resMsg = "<p style='color:blue'>��� ������ ���̵� �Դϴ�.</p>";
				}
				$('#target').css('display','block').css('background','pink');
				$('#target').html(resMsg);
			}
			
		});
		
		
	});
});




	function idCheck() {//2 click
		// �Ķ���� �ޱ� 
		var id = document.getElementById("id").value;
		// client ------�񵿱������-------> Server  
		var param ="id="+id
		sendRequest("idcheck", param, res, "get");
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















