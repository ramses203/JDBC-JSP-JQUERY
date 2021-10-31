<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div class="add_all">
<div class="add_sub">
	<div class="group">
		<input class="form" type="text" name="id" id="id"> 
		<span class="highlight"></span> <span class="bar"></span> <label>���̵�</label>
	</div>
	<div class="group">      
     	<input class="form" type="tel" name="phone" id="phone" maxlength="13"  onkeydown="return onlyNumber(event)" onkeyup="removeChar(event)">
      <span class="highlight"></span>
      <span class="bar"></span>
      <label>��ȭ��ȣ</label>
    </div>
    <div style="display: none;" id="target"></div>
     <input class="posibtn" type="button" id="btn" value="Ȯ��">
	<a href="login"><input class="posibtn" type="button" value="���ư���"></a>
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

$(function () {
	$('#btn').click(function () {
		var id = $('#id').val();
		var phone = $('#phone').val();
		
		$.ajax({
			url: "findpwdprocess?id="+id+"&phone="+phone,
			cache: false,
			success: function (data) {
				var resMsg = "";
				if(data === ""){
					resMsg = "<p style='color:red'>������ �ش� ���̵� �����ϴ�.</p>";
				}else if (data != null) {
						resMsg = "<p style='color:blue'>"+id+"���� ��й�ȣ�� " + data +"�Դϴ�.</p>";
				}
				$('#target').css('display','block').css('background','pink');
				$('#target').html(resMsg);
			}
			
		});
	});
	
});

</script>


