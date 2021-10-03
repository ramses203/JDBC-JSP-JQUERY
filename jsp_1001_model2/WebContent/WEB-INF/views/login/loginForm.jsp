<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>로그인 화면입니다.</h2>
</div>
<form method="post" action="main.kosmo">
<input type="hidden" name="cmd" value="loginProcess">
<input type="hidden" name="subcmd" value="${subcmd}">
<input type="hidden" name="viewName" value="${viewName}">
<input type="hidden" name="num" value="${num}">
<table border="1">
<tr>
   <th colspan="2">로그인</th>
</tr>
<tr>
   <td>아이디</td>
   <td><input type="text" name="id"></td>
</tr>
<tr>
   <td>비밀번호</td>
   <td><input type="password" name="pwd"></td>
</tr>
<tr>
   <th colspan="2">
   <input type="submit" value="등록">
   <input type="reset" value="취소">
   </th>
</tr>
</table>
</form>


</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>

</body>
</html>