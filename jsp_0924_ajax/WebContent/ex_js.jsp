<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--

자바스크립트 기본 문법 약간 소개 
자바스크립트 : 클라이언트 스크립트 언어 
-브라우저에 자바스크립트 엔진이 탑재 되어 있어서 브라우저에서
해석이 됨
<script> 영역의 선언은 보통은 <head>에 선언되는 것이 
일반적이나 최근에는 항상 문장의 끝 </body> 영역안에서 
선언 하기도 한다. 
* 변수 선언 : var , let 이 있는데 차이는 추후에 
* console.log() 함수를 사용해서 개발자 모드에서 
데이터를 출력 해볼 수 있다. System.out.println() 같음 
--%>
<%-- 실행 순서 
1. 서버측에서 서블릿으로 변환 후 
2. 모든 자바코드를 실행해서 결과페이지를 만든다.
3. 브라우저에게 response로 전달한다.
--------------------------------
1. 클라이언트는 요청에 따른 응답으로 받은 내용을 
2. 위에서 부터 순차적으로 실행하다가
3. 자바스크립트를 만나면 실행을 순서대로 다 하고 나서
4. dom(태그) 객체를 생성한다.
5. 아래의 순서 참고
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	//함수로 정의 - 자바의 메서드와 동일, 반환형return 있다. 
	// 자바 메서드 => public 자료형 or void method(자료형 변수명){ return }
	// 자바 script => function 함수명(var 변수) {return}
	// Boolean, Null, Underfined, Number, String
	function mytest() {
	// 1
	// 자바스크립트 자료형 및 ==, ===연산자 특징 알기
	var msg1 = "자바스크립트1";
	var msg2 = "자바스크립트2";
	var num1 = 10.1;
	var num2 = 10;
	var numv2 = "10";
	var num3 = true;
	var num5;
	var num6 = null; //알수없는 객체값
	console.log("안녕하세요. 나의"+msg1);
	console.log("안녕하세요. 나의"+typeof(msg2));// typeof는 변수의 반환형을 반환해준다.
	console.log(typeof(num1));
	console.log(typeof(num2));
	console.log(typeof(num3));
	console.log(typeof(num4));//선언이 안된 변수를 typeof를 적용해보면 undefined(선언이 되지않은)이 나온다.*****
	console.log(typeof(num5));// var형 변수에 값을 입력하지 않고 typeof를 적용시켜보면 undefined(선언이 되지않은)이 나온다.*****
	console.log(typeof(num6));//objectfh 나오게 된다.null도 객체라는것을 증명할수있겠다.
	console.log("== : " +(num2 == numv2));//동등 연산자로 좌항과 우항을 비교해서 서로 값이 같다면 true 다르다면 false가 된다.
	console.log("=== : " +(num2 == numv2));//일치연산 자를 사용하게 되면 좌항과 우항에 정보가 같을 뿐만 아니라  
										  // 데이 터의 형식 또 한 같아야 true를 반환한다  
											//하지만 동등 연산자는 좌항과 우항의 값의  타입이 달라도
											//실질적으로 갖고 있는 정보가 동일하다면 , java script는 같은 값으로 인정해주는 연산자를제공해준다 
	var n1 = "10";
	var n2 = "10";
	console.log(n1+n2);
	// id속성의 값을 자바스크립트 DOM객체 인식 후 value란 속성에 접근해서 사용자가 입력한 값을 가져와서
	// 변수 msg 에 저장한다. 
	var msg = document.getElementById("msg").value;
	console.log(msg);
	// innerHTMl 사용해서 div안에 text에 접근
	document.getElementById("target").innerHTML="<p style=\"color:blue\">"+msg+"</p>";
	
	
	}
	
	
</script>
</head>
<body>
	<div id="target">내용!</div>
	<input type="text" name="msg" id="msg" value="">
	<input type="button" value="클릭" onclick="mytest()">
</body>
</html>