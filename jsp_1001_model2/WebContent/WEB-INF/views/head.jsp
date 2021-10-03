<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">
<script src="resources/js/myhttp.js"></script>
<script src="resources/js/json2.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@splidejs/splide@latest/dist/css/splide.min.css">
<script src="https://cdn.jsdelivr.net/npm/@splidejs/splide@latest/dist/js/splide.min.js"></script>

<style>
/* css에서의 주석
	E : element 요소
	id :  id속성 => 반드시 한페이지에서는 유일해야 한다. #아이디
	class : class속성 , 한페이지에서 중복가능, 하나 이상을 설정 할 수 있다. .클래스
	[E,#id,.class, 자식 > ,부모 후손 , 이웃요소] {   css문법 예) color:"red"; size:200px;  }
	*/
#content {
	width: 100%;
}

#content table {
	width: 350px;
	margin: auto
}

#content table, td, th {
	border: 1px solid black;
}

#content table {
	width: 100%;
	border-collapse: collapse;
}
.splide__slide img {
	width : 100%;
	height: auto;
}

</style>


<script>
	sendRequest("main.kosmo?cmd=galleryNotice",null,resGallery,"GET");
	function resGallery(){
		if (myXhr.readyState === 4) {
			if (myXhr.status === 200) {
				//console.log(xhr.status);
				console.log(myXhr.responseText);
				var txt = myXhr.responseText;
				var jsonArr = null;
				// json타입으로 넘어온 데이터를 자바스크립트  object 타입으로 해석해주는 함수이다.
				jsonArr = JSON.parse(txt);
				var tag = "";
				var ccList = document.getElementsByClassName("cc");
				// class는 집합객체
				var tlinks = document.getElementsByClassName("tlink");
				for(var i=0; i< jsonArr.length; i++){
					var jsonObj = jsonArr[i];
					ccList[i].src="Upload/"+jsonObj.imgn;
					tlinks[i].href="main.kosmo?cmd=gallery&viewName=galleryDetail&num="+jsonObj.num;
				}

				var splide = new Splide( '.splide' ,{ 
					'cover':true,
					'heightRatio': 0.3,
					type   : 'loop',
					autoplay : true,
				} );
				splide.mount();
			}
		}
	}
</script>
</head>
<body>
   <h3>현재 접속한 아이디는 ${sessionScope.sessionID } 입니다.</h3>
	<div id="wrap">
		<div id="navigation">
			<ul>
				<li><a href="main.kosmo?cmd=index">Home</a></li>
				<c:choose>
					<c:when test="${sessionScope.sessionID == null}">
						<li><a href="main.kosmo?cmd=loginForm">로그인</a></li>
						<li><a href="main.kosmo?cmd=member&viewName=memberForm">회원가입</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="main.kosmo?cmd=logoutProcess">로그아웃</a></li>
						<li><a href="main.kosmo?cmd=myPage&viewName=myPageForm&id=${sessionScope.sessionID}">마이페이지</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="main.kosmo?cmd=board&viewName=write">게시판</a></li>
				<li><a href="main.kosmo?cmd=gallery&viewName=galleryList">겔러리</a></li>
				<li><a href="main.kosmo?cmd=vfname&viewName=el1form">EL예제1</a></li>
			</ul>
		</div>
<!-- 		<div id="bgx"></div> -->
<div id="image-slider" class="splide">
	<div class="splide__track" id="mysplide_target">
	<ul class="splide__list" >	
	<li class="splide__slide">
			<a href="" class="tlink"><img src="img/bgg1.jpg" class="cc" id="cc1"></a>
	</li>
	<li class="splide__slide">
				<a href="" class="tlink"><img src="img/bgg2.jpg" class="cc" id="cc2"></a>
	</li>
	<li class="splide__slide">
				<a href="" class="tlink"><img src="img/bgg3.jpg" class="cc" id="cc3"></a>
	</li>
	</ul>
	</div>
	<div class="splide__progress">
		<div class="splide__progress__bar">
		</div>
	</div>
</div>
		
		
		
		
		