<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<h2> Home ȭ���Դϴ�. </h2><!-- ���������� WEB-INF�����ȿ� �ֱ� ������ �ٷ� ������. �׷��� index������������ ������ش�.WEB=INF�� index.jsp����� -->
<div style="width: 450px; margin: auto">
	<form action="main.kosmo" method="post">
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
<script src="resources/js/myhttp.js"></script>
<script>
var xhr = null;
	window.onload=function(){
	xhr = myRequest();
	};
	function idCheck(){
		var id = document.getElementById("id").value;
		// Client --------�񵿱������------->server
		var param = "idv=" + id;
		xhr.onreadystatechange = res;
		/* main.kosmo
		main.kosmo
		main.kosmo
		*/
		xhr.open("post", "main.kosmo?cmd=member&viewName=memberIdChk");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=euc-kr");
	    xhr.send(param); //GET -> send();
	    
	}
	
	function res(){
		if(xhr.readyState === 4){
			if(xhr.status === 200){
				console.log(xhr.status);
				console.log(xhr.responseText);
				var txt = xhr.responseText;//xhr.responseText�� ������ ��Ƽ� html�� ǥ���Ѵ�. 
				var resMsg = "";
				console.log(typeof(txt));
				if(txt === "1"){
					resMsg = "<p style='color:red'>�̹� ������Դϴ�.</p>";
				}else{
					resMsg = "<p style='color:blue'>��밡���� ���̵� �Դϴ�.</p>";
				}
				document.getElementById("target").style.display='block';
				document.getElementById("target").innerHTML=resMsg;
			}
		}
	}	
	    
	
	
</script>
</body>
</html>    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
