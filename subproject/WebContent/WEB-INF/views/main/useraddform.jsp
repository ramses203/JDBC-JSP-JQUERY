<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link rel="stylesheet" href="resources/css/css_userAdd.css">
<div class="add_all">
<div class="add_sub">
   
  <form action="useradd" method="post">
    
    <div class="group">      
    	<input class="form" type="text" name="id" id="id"> <input class="tobtn" type="button" id="btn" value="중복확인">
		<div style="display: none;" id="target"></div>
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>아이디</label>
    </div>
      
    <div class="group">      
      <input class="form" type="text" name="pwd" id="pwd">
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>비밀번호</label>
    </div>
    <div class="group">      
      <input class="form" type="text" name="uname" id="uname">
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>이름</label>
    </div>
    <div class="group">      
     	<input class="form" type="tel" name="phone" id="phone" maxlength="13"  onkeydown="return onlyNumber(event)" onkeyup="removeChar(event)">
     	 <input	class="tobtn" type="button" id="btn2" value="중복확인">
		<div style="display: none;" id="target2"></div>
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>전화번호</label>
    </div>
    <div class="positions">
   	 포지션<br> 
			탑<input type="radio" name="position" id="position" value="T">
			미드<input type="radio" name="position" id="position" value="M">
			바텀<input type="radio" name="position" id="position" value="B">
			서폿<input type="radio" name="position" id="position" value="S">
			정글<input type="radio" name="position" id="position" value="J">
	</div>
    <input class="posibtn" type="submit" value="가입">
	<a href="login"><input class="posibtn" type="button" value="취소"></a>
  </form>
      

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
		var id = $('#id').val();
		// var obj = {"":"",ss:function(){}}
		$.ajax({
			url: "idcheck?id="+id,
			cache : false, //ajax 통신중  캐시롤 삭제
			async : false,
			success:function(res){ // 콜백
				console.log("data: "+res);
				var resMsg = "";
				if (res === "1") {
					resMsg = "<p style='color:red'>이미 사용중인 아이디 입니다.</p>";
				} else {
					resMsg = "<p style='color:blue'>사용 가능한 아이디 입니다.</p>";
				}
				$('#target').css('display','block').css('background','pink');
				$('#target').html(resMsg);
			}
			
		});
		
		
	});
});



$(function() {
	$('#btn2').click(function() {
		var phone = $('#phone').val();
		// var obj = {"":"",ss:function(){}}
		$.ajax({
			url: "phonecheck?phone="+phone,
			cache : false, //ajax 통신중  캐시롤 삭제
			success:function(cnt){ // 콜백
				console.log("data: "+cnt);
				var resMsg = "";
				if (cnt === "1") {
					resMsg = "<p style='color:red'>이미 사용중인 전화번호 입니다.</p>";
				} else {
					resMsg = "<p style='color:blue'>사용 가능한 전화번호 입니다.</p>";
				}
				$('#target2').css('display','block').css('background','pink');
				$('#target2').html(resMsg);
			}
			
		});
		
		
	});
});



<%--var autoHypenPhone = function(str){
    str = str.replace(/[^0-9]/g, '');
    var tmp = '';
    if( str.length < 4){
        return str;
    }else if(str.length < 7){
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3);
        return tmp;
    }else if(str.length < 11){
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 4);
        tmp += '-';
        tmp += str.substr(7);
        return tmp;
    }else{              
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 4);
        tmp += '-';
        tmp += str.substr(7);
        return tmp;
    }

    return str;
}


var phoneNum = document.getElementById('tel');

phoneNum.onkeyup = function(){
console.log(this.value);
this.value = autoHypenPhone( this.value ) ;  
}--%>


</script>