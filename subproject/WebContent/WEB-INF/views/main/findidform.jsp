<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div class="add_all">
<div class="add_sub">
	<div class="group">
		<input class="form" type="text" name="uname" id="uname"> 
		<span class="highlight"></span> <span class="bar"></span> <label>이름</label>
	</div>
	<div class="group">      
     	<input class="form" type="tel" name="phone" id="phone" maxlength="13"  onkeydown="return onlyNumber(event)" onkeyup="removeChar(event)">
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>전화번호</label>
    </div>
    <div style="display: none;" id="target"></div>
     <input class="posibtn" type="button" id="btn" value="확인">
	<a href="login"><input class="posibtn" type="button" value="돌아가기"></a>
</div>
</div>

<script>
function onlyNumber(event) {
	event = event || window.event;
	var keyID = (event.which)
		? event.which
		: event.keyCode;
	if ((keyID >= 48 && keyID <= 57) || (keyID >= 96 && keyID <= 105) || keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39) 
		return;
	 else 
		return false;
};

function removeChar(event) {
	event = event || window.event;
	var keyID = (event.which)
		? event.which
		: event.keyCode;
	if (keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39) 
		return;
	 else 
		event.target.value = event
			.target
			.value
			.replace(/[^0-9]/g, "");
};
$(function() {
	$('#btn').click(function() {
		var uname = $('#uname').val();
		var phone = $('#phone').val();
		
		// var obj = {"":"",ss:function(){}}
		$.ajax({
			url: "findidprocess?uname="+uname+"&phone="+phone,
			cache : false, //ajax 통신중  캐시롤 삭제
			success:function(data){ // 콜백
				var resMsg = "";
				if(data === ""){
					resMsg = "<p style='color:red'>가입한 해당 아이디가 없습니다.</p>";
				}else if (data != null) {
						resMsg = "<p style='color:blue'>"+uname+"님의 아이디는 " + data +"입니다.</p>";
				}
				$('#target').css('display','block').css('background','pink');
				$('#target').html(resMsg);
			}
			
		});
		
		
	});
});

</script>
