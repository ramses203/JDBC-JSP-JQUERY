<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ include file="head.jsp" %>
<div id="content">
<h2> Test Main </h2><!-- ���������� WEB-INF�����ȿ� �ֱ� ������ �ٷ� ������. �׷��� index������������ ������ش�.WEB=INF�� index.jsp����� -->
</div>
<form method="post" action="main.kosmo">
	<input type="hidden" name="cmd" value="el1">
	�̸� : <input type="text" name="name"><br>
	email : <input type="text" name="email"><br>
	phone: <input type="text" name="phone"><br>
	<input type="submit" value="send">
</form>
</div>
</div>
</body>
</html>
    
    
    
