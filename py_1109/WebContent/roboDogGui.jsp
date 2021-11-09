<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
	<input type="button" id="onBtn" value="on">
	<input type="button" id="offBtn" value="off">
	
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(function() {
	function goPower(status) {
		alert('status'+status)
		$.ajax({
			url:"roboService?status="+status,
			success: function(data) {
				$('#target').html(data);
			}
		})
	}
	$('#onBtn').click(function(){
		goPower($(this).val())
	});
	
	$('#offBtn').click(function(){
		goPower($(this).val())
	});
});
</script>
</body>
</html>