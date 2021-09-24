<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
// 현재 브라우저에 맞게 뭐를 생성하는 코드다
var xhr = null;// 전역변수 
function myRequest(){ // 브라우저에 따른 XMLHTTPRequest 생성 (xml이 붙으면 비동기식이다.)
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
		// Client --------비동기식으로------->server
		var param = "subject=" + subject;
		console.log("subject : " + subject);
		console.log("param : " + param);
		//callback함수의 이름을 지정 순서 알고있으면 좋겠다.
		xhr.onreadystatechange = checkFunc;
		xhr.open("post", "ex3_ajaxServer.jsp");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	    xhr.send(param); //GET -> send();
	}
	// 서버에서 데이터를 받을 함수를 지정
	function checkFunc(){
		if(xhr.readyState ==4){
			if(xhr.status == 200){
				console.log(xhr.status);
				console.log(xhr.responseText);
				var txt = xhr.responseText;//xhr.responseText를 변수에 담아서 html로 표시한다. 
				document.getElementById("target").innerHTML=txt;
			}
		}
	}
	
</script>

</head>
<body>
	<form action="">
		과목 선택 : <select name="subject" id="subject">
			<option value="">과목</option>
			<option value="java">java과목</option>
			<option value="oracle">oracle과목</option>
			<option value="jsp">jsp과목</option>
		</select>
		<div id="target"></div>
		<input type="button" value="선택" onclick="mySub()">
	</form>

</body>
</html>