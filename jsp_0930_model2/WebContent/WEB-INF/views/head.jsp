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
				//console.log(myXhr.responseText);
				var txt = myXhr.responseText;
				var jsonArr = null;
				jsonArr = JSON.parse(txt);
				var tag = "";
				document.getElementById("cc1").src="Upload/"+jsonArr[0];
				document.getElementById("cc2").src="Upload/"+jsonArr[1];
				document.getElementById("cc3").src="Upload/"+jsonArr[2];
// 				for(var i=0; i < jsonArr.length; i++){
// 					tag += "<ul class=\"splide__list\" >";
// 					tag += "<li class=\"splide__slide\">";
// 					tag += "<img src=\"Upload/"+jsonArr[i]+"\">";
// 					tag += "</li>";
// 					tag += "</ul>";
// 				console.log(jsonArr[i]);
// 				}
				//document.getElementById("mysplide_taget").innerHTML=tag;
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
   <h1>${sessionScope.sessionID }</h1>
	<div id="wrap">
		<div id="navigation">
			<ul>
				<li><a href="../index.jsp">Home</a></li>
				<c:choose>
					<c:when test="${sessionScope.sessionID == null}">
						<li><a href="main.kosmo?cmd=loginForm">로그인</a></li>
						<li><a href="main.kosmo?cmd=member&viewName=memberForm">회원가입</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="main.kosmo?cmd=logoutProcess">로그아웃</a></li>
						<li><a href="">마이페이지</a></li>
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
				<img src="img/bgg1.jpg" class="cc" id="cc1">
	</li>
	<li class="splide__slide">
				<img src="img/bgg2.jpg" class="cc" id="cc2">
	</li>
	<li class="splide__slide">
				<img src="img/bgg3.jpg" class="cc" id="cc3">
	</li>
	</ul>
	</div>
	<div class="splide__progress">
		<div class="splide__progress__bar">
		</div>
	</div>
</div>
		
		
		
		
		