<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index.jsp</title>
<link rel="stylesheet" type="text/css" href="resources/css/main.css"> 
<script src="resources/js/myhttp.js"></script>
<script src="resources/js/json2.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@splidejs/splide@latest/dist/css/splide.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/@splidejs/splide@latest/dist/js/splide.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
/* css������ �ּ�
	E : element ���
	id :  id�Ӽ� => �ݵ�� �������������� �����ؾ� �Ѵ�. #���̵�
	class : class�Ӽ� , ������������ �ߺ�����, �ϳ� �̻��� ���� �� �� �ִ�. .Ŭ����
	[E,#id,.class, �ڽ� > ,�θ� �ļ� , �̿����] {   css���� ��) color:"red"; size:200px;  }
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
	width: 100%;
	height: auto;
}
</style>


<script>
	//sendRequest("main.kosmo?cmd=galleryNotice", null, resGallery, "GET");
	function resGallery() {
		if (myXhr.readyState === 4) {
			if (myXhr.status === 200) {
				//console.log(xhr.status);
				//console.log(myXhr.responseText);
				var txt = myXhr.responseText;
				var jsonArr = null;
				// jsonŸ������ �Ѿ�� �����͸� �ڹ� ��ũ��Ʈ object Ÿ������ �ؼ����ִ� �Լ��̴�.
				jsonArr = JSON.parse(txt);
				var tag = "";
				var ccList = document.getElementsByClassName("cc");
				// class�� ���հ�ü => �迭
				var tlinks = document.getElementsByClassName("tlink");
				for (var i = 0; i < jsonArr.length; i++) {
					var jsonObj = jsonArr[i];
					ccList[i].src = "Upload/"+jsonObj.imgn;
					tlinks[i].href="main.kosmo?cmd=gallery&viewName=galleryDetail&num="+jsonObj.num;
				}
				var splide = new Splide('.splide', {
					'cover' : true,
					'heightRatio' : 0.3,
					type : 'loop',
					autoplay : true,
				});
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
				<li><a href="index">Home</a></li>
				<c:choose>
					<c:when test="${sessionScope.sessionID == null}">
						<li><a href="loginForm">�α���</a></li>
						<li><a href="memberform">ȸ������</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="logoutProcess">�α׾ƿ�</a></li>
						<li><a href="main.kosmo?cmd=mypage&viewName=page">����������</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="main.kosmo?cmd=board&viewName=list">�Խ���</a></li>
				<li><a href="main.kosmo?cmd=gallery&viewName=galleryList">�ַ���</a></li>
				<li><a href="mboardList">Model1Board</a></li>
				<li><a href="updemoList">���Ͼ��ε�</a></li>
				<li><a href="survey">surveyForm</a></li>
			</ul>
		</div>
		<!-- 		<div id="bgx"></div> -->
		<div id="image-slider" class="splide">
			<div class="splide__track" id="mysplide_target">
				<ul class="splide__list">
					<li class="splide__slide"><a href="" class="tlink"><img src="resources/img/bg1.jpg" class="cc" id="cc1"></a></li>
					<li class="splide__slide"><a href="" class="tlink"><img src="resources/img/bgg1.jpg" class="cc" id="cc2"></a></li>
					<li class="splide__slide"><a href="" class="tlink"><img src="resources/img/bgg2.jpg" class="cc" id="cc3"></a></li>
				</ul>
			</div>
			<div class="splide__progress">
				<div class="splide__progress__bar"></div>
			</div>
		</div>
		<script>
		window.onload=function(){
			var splide = new Splide('.splide', {
				'cover' : true,
				'heightRatio' : 0.3,
				type : 'loop',
				autoplay : true,
			});
			splide.mount();
		}
		</script>