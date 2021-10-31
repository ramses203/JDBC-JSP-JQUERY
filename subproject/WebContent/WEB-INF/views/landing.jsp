<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>성열차트</title>
<link rel="shortcut icon" href="resources/img/logo.jpg">
 <link href="resources/css/css_landing.css" rel="stylesheet">
</head>
<body>
	<div class="landing">
		<div id="videobox">
			<video preload="auto" data-autoplay autoplay loop muted playsinline volume="0" width="100%" height="100%">
				<source src="resources/video/landingVideo.mp4" type="video/mp4">
			</video>
			<div id="outbox" style="opacity:0; visibility: hidden;">
				<a href="javascript:;" onClick="delayURL('login','500')" > <button class="bubbly-button">입장하기</button></a>
			</div>
		</div>
	</div>
	<script>
		var animateButton = function(e) {

		  e.preventDefault;
		  //reset animation
		  e.target.classList.remove('animate');
		  
		  e.target.classList.add('animate');
		  setTimeout(function(){
		    e.target.classList.remove('animate');
		  },700);
		};

		var bubblyButtons = document.getElementsByClassName("bubbly-button");

		for (var i = 0; i < bubblyButtons.length; i++) {
		  bubblyButtons[i].addEventListener('click', animateButton, false);
		}
		
		function delayURL(url, time) {
		    setTimeout("top.location.href='" + url + "'", time);
		}
	
	</script>
</body>
</html>