<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
/*  
 	 step1) 1~9���� table �ȿ��� tr�� �ݺ��ϴ� �±׸� ����� ���ô�. 
 	 // �ʱ�� : ���ѹ� �ʱ�ȭ
 	 // ���ǽ�: ������ ������ �׻� ���ǽ��� �����ϴ� ��츸 ����
 	 // ������: ���� �� �ʱ�Ŀ� ���� ������ ���� ����, ���ϴ� �����
 	 for(�ʱ��; ���ǽ�; ������){
 		 ���๮;
 	 }
 */
/*  	function dantest() {
	// 	step2) ������
	// 2 x 1 = 2    3 x 1 = 3..
	// ...
	//2 x 9 = 18    3 x 9 = 27.. 
	var tag = "<table border='1'>";
	for(var i=1; i<=9; i++){
	tag +="<tr>";
	tag +="<td>"+i+"</td>";
	tag +="</tr>";
	}
	tag +="</table>";
	document.getElementById("target").innerHTML=tag;
	
 } */
	 function dantest() {
	 var danv = document.getElementById("dan").value;
	 var limitv = document.getElementById("limitv").value;
	 //��������
	var startv =parseInt( parseInt(danv,10) - parseInt(limitv,10)/2 ,10) + 1;
    var endv = parseInt(parseInt(danv,10) + parseInt(limitv,10)/2,10);

	 
	 console.log(typeof(startv)); 
	 //console.log(danv + limitv);
	// dan �������� �ʱ��
	 console.log("�ʱ�� :"+startv);
	 console.log("�ʱ�� :"+endv);
	 
	 
	 //�غ��� �ڶ��� ��-> ����, Ÿ��Ʋ�� -> ���̻� for�� �ݺ���Ű�� ����
	 // Scanner �� ������ �����ϴ�. 
	 var tag = "<table border='1'>";
	 for(var i=1; i<=9; i++){
	 tag +="<tr>";
	 for(var j=startv; j<=endv; j++){
	 tag +="<td>"+j+ " x " + i + " = " + (i*j) + "</td>";
 	}
	 tag +="</tr>";
 }
 	tag +="</table>";
	document.getElementById("target").innerHTML=tag;
 }
</script>
</head>
<body>
	<form action="" method="post">
		<input type="color" name="col" id="col"> <input type="text"
			name="dan" id="dan"> <select name="limitv" id="limitv">
			<option value="0">����</option>
			<option value="1">1����</option>
			<option value="3">3����</option>
			<option value="5">5����</option>
			<option value="7">7����</option>
			<option value="9">9����</option>
		</select> <input type="button" value="��" onclick="dantest()">
		<div id="target"></div>
	</form>
</body>
</html>