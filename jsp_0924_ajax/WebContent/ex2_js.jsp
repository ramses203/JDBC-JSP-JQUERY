<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
/*  
 	 step1) 1~9까지 table 안에서 tr을 반복하는 태그를 만들어 봅시다. 
 	 // 초기식 : 딱한번 초기화
 	 // 조건식: 실행의 조건은 항상 조건식을 만족하는 경우만 실행
 	 // 증감식: 실행 후 초기식에 담은 변수의 값을 증가, 감하는 연산식
 	 for(초기식; 조건식; 증감식){
 		 실행문;
 	 }
 */
/*  	function dantest() {
	// 	step2) 구구단
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
	 //정수변경
	var startv =parseInt( parseInt(danv,10) - parseInt(limitv,10)/2 ,10) + 1;
    var endv = parseInt(parseInt(danv,10) + parseInt(limitv,10)/2,10);

	 
	 console.log(typeof(startv)); 
	 //console.log(danv + limitv);
	// dan 기준으로 초기식
	 console.log("초기식 :"+startv);
	 console.log("초기식 :"+endv);
	 
	 
	 //해봐서 자랑할 팀-> 색상값, 타이틀단 -> 더이상 for문 반복시키지 말고
	 // Scanner 로 변경이 가능하다. 
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
			<option value="0">범위</option>
			<option value="1">1범위</option>
			<option value="3">3범위</option>
			<option value="5">5범위</option>
			<option value="7">7범위</option>
			<option value="9">9범위</option>
		</select> <input type="button" value="단" onclick="dantest()">
		<div id="target"></div>
	</form>
</body>
</html>