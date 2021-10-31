<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link rel="stylesheet" href="resources/css/css_userAdd.css">
<div class="add_all">
<div class="add_sub">
	<form action="gameInsert" method="post">
		<div class="group">
			<input class="form" type="text" name="count" id="count"> 
			<span class="highlight"></span> <span class="bar"></span> <label>생성 갯수</label>
		</div>
		<input class="posibtn"  type="submit" value="생성">
		<a href="login"><input class="posibtn" type="button" value="취소"></a>
	</form>
</div>
</div>
