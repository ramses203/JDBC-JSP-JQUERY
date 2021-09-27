<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
// ���� �������� �°� ���� �����ϴ� �ڵ��
var xhr = null;// �������� 
function myRequest(){ // �������� ���� XMLHTTPRequest ���� (xml�� ������ �񵿱���̴�.)
	if(window.ActiveXObject){
		try{
			xhr = ActiveXObject("Msxml2.XMLHTTP");
		}catch(e){
			xhr = ActiveXObject("Microsoft.XMLHTTP");
		}
		console.log("ActiveXObject =>"+xhr);
	}else if(window.XMLHttpRequest){
		xhr = new window.XMLHttpRequest();
		console.log("window.XMLHttpRequest =>"+xhr);
	}else{
		xhr = new XMLHttpRequest();
		console.log("XMLHttpRequest =>"+xhr);
	}
	//return xhr;
}
	function mySub() {
		myRequest();
		console.log("Test");
		var subject = document.getElementById("subject").value;
		// Client --------�񵿱������------->server
		var param = "subject=" + subject;
		console.log("subject : " + subject);
		console.log("param : " + param);
		//callback�Լ��� �̸��� ���� ���� �˰������� ���ڴ�.
		xhr.onreadystatechange = checkFunc;
		xhr.open("post", "ex3_ajaxServer.jsp");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	    xhr.send(param); //GET -> send();
	}
	// �������� �����͸� ���� �Լ��� ����
	function checkFunc(){
		if(xhr.readyState ==4){
			if(xhr.status == 200){
				console.log(xhr.status);
				console.log(xhr.responseText);
				var txt = xhr.responseText;//xhr.responseText�� ������ ��Ƽ� html�� ǥ���Ѵ�. 
				document.getElementById("target").innerHTML=txt;
			}
		}
	}
	
</script>

</head>
<body>
	<form action="">
		���� ���� : <select name="subject" id="subject">
			<option value="">����</option>
			<option value="java">java����</option>
			<option value="oracle">oracle����</option>
			<option value="jsp">jsp����</option>
		</select>
		<div id="target"></div>
		<input type="button" value="����" onclick="mySub()">
	</form>

</body>
</html>