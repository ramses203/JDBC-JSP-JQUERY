<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="main">
	<div class="main_detail">
		<div class="inner_login">
			<div class="login_tistory">
				<form method="post" id="authForm" action="loginProcess">
					<fieldset>
						<legend class="screen_out">�α��� �Է� ��</legend>
						<div class="box_login">
							<div class="inp_text">
								<label for="loginId" class="screen_out">���̵�</label> <input
									type="text" id="id" name="id" placeholder="ID">
							</div>
							<div class="inp_text">
								<label for="loginPw" class="screen_out">�н�����</label> <input
									type="password" id="pwd" name="pwd"
									placeholder="Password">
							</div>
						</div>
						<button type="submit" class="btn_login">�α���</button>
						<div class="login_append">
							<span class="txt_find"> <a href="findidform" class="link_find">���̵�
									ã��</a> / <a href="findpwform" class="link_find">�н����� ã��</a> / 
									<a href="useraddform" class="link_find">ȸ������</a>
							</span>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</div>