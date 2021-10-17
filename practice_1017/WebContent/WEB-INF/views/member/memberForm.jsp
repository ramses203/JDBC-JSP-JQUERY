<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="content">
<div style="width: 450px; margin: auto" >
	<form action="memberIn" method="post">
		
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
			<input type="submit" value="가입">
		</p>
	</form>
</div>
</div>


<script>
//jQuery
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

</script>
</body>
</html>