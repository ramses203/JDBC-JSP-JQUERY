<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp"%>
<div id="content">
<div style="width: 450px; margin: auto" >
	<form action="memberIn" method="get">
		<input type="hidden" name="cmd" value="member"> <input
			type="hidden" name="viewName" value="memberIn">
		<p>
			아이디 : <input type="text" name="id" id="id">&nbsp; <input
				type="button" id="btn" value="중복확인">
		<div style="display: none;" id="target"></div>
		</p>
		<p>
			비밀번호 : <input type="text" name="pwd" id="pwd">
		</p>
		<p>
			이름 : <input type="text" name="name" id="name">
		</p>
		<p>
			나이 : <input type="number" name="age" id="age" value="10">
		</p>
		<p>
			이메일 : <input type="text" name="email" id="email">
		</p>
		<p>
			<input type="submit" value="가입">
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
			cache : false, //ajax 통신중  캐시롤 삭제
			success:function(data){ // 콜백
				console.log("data: "+data);
				var resMsg = "";
				if (data === "1") {
					resMsg = "<p style='color:red'>이미 사용중입니다.</p>";
				} else {
					resMsg = "<p style='color:blue'>사용 가능한 아이디 입니다.</p>";
				}
				$('#target').css('display','block').css('background','pink');
				$('#target').html(resMsg);
			}
			
		});
		
		
	});
});




	function idCheck() {//2 click
		// 파라미터 받기 
		var id = document.getElementById("id").value;
		// client ------비동기식으로-------> Server  
		var param ="id="+id
		sendRequest("idcheck", param, res, "get");
	}
	// 서버에서 데이터를 받을 함수를 지정 
	function res() { // 3 서버 갔다가 
		if (myXhr.readyState === 4) {
			if (myXhr.status === 200) {
				console.log(myXhr.status);
				console.log(myXhr.responseText);
				var txt = myXhr.responseText;
				var resMsg = "";
				console.log(typeof (txt));
				if (txt === "1") {
					resMsg = "<p style='color:red'>이미 사용중입니다.</p>";
				} else {
					resMsg = "<p style='color:blue'>사용 가능한 아이디 입니다.</p>";
				}
				document.getElementById("target").style.display = 'block';
				document.getElementById("target").innerHTML = resMsg;
			}
		}
	}
</script>

</body>
</html>















