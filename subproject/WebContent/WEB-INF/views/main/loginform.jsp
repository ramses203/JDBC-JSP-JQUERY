<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="main">
	<div class="main_detail">
		<div class="inner_login">
			<div class="login_tistory">
				<form method="post" id="authForm" action="loginProcess">
					<fieldset>
						<legend class="screen_out">로그인 입력 폼</legend>
						<div class="box_login">
							<div class="inp_text">
								<label for="loginId" class="screen_out">아이디</label> <input
									type="text" id="id" name="id" placeholder="ID">
							</div>
							<div class="inp_text">
								<label for="loginPw" class="screen_out">패스워드</label> <input
									type="password" id="pwd" name="pwd"
									placeholder="Password">
							</div>
						</div>
						<button type="submit" class="btn_login">로그인</button>
						<div class="login_append">
							<span class="txt_find"> <a href="findidform" class="link_find">아이디
									찾기</a> / <a href="findpwform" class="link_find">패스워드 찾기</a> / 
									<a href="useraddform" class="link_find">회원가입</a>
							</span>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</div>