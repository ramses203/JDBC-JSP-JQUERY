<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="resources/js/myhttp.js"></script>
<script>
var xhr = null;
	window.onload=function(){
	xhr = myRequest();
	};
	function idCheck(){
		var id = document.getElementById("id").value;
		// Client --------비동기식으로------->server
		var param = "idv=" + id;
		
		xhr.onreadystatechange = res;
		xhr.open("post", "memberidChk.jsp");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	    xhr.send(param); //GET -> send();
	    
	}
	
	function res(){
		if(xhr.readyState == 4){
			if(xhr.status == 200){
				console.log(xhr.status);
				console.log(xhr.responseText);
				var txt = xhr.responseText;//xhr.responseText를 변수에 담아서 html로 표시한다. 
				var resMsg = "";
				console.log(typeof(txt));
				if(txt === "1"){
					resMsg = "<p style='color:red'>이미 사용중입니다.</p>";
				}else{
					resMsg = "<p style='color:blue'>사용가능한 아이디 입니다.</p>";
				}
				document.getElementById("target").style.display='block';
				document.getElementById("target").innerHTML=resMsg;
			}
		}
	}	
	    
	
	
</script>
</head>
<body>
	<div style="width: 450px; margin: auto">
	<form action="memberAdd.jsp" method="post">
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

</body>
</html>