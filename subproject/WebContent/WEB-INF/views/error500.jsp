<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <link href="resources/css/css_landing.css" rel="stylesheet">
<meta charset="EUC-KR">
<title>Landing Page</title>
</head>
<body>
	<div class="landing">
		<div id="videobox">
			<video preload="auto" data-autoplay autoplay loop muted playsinline volume="0" width="100%" height="100%">
				<source src="resources/video/landingVideo.mp4" type="video/mp4">
			</video>
			<div id="outbox_error" >
				<a href="login"><input class="bubbly-button" type="button" value="게임 정보가 없습니다. 먼저 입력을 하세요." style="width: auto; margin: 0 auto;"></a>
			</div>
		</div>
	</div>
</body>
</html>