<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>�α��� ȭ���Դϴ�.</h2>
</div>
<form method="post" action="main.kosmo">
<input type="hidden" name="cmd" value="loginProcess">
<input type="hidden" name="subcmd" value="${subcmd}">
<input type="hidden" name="viewName" value="${viewName}">
<input type="hidden" name="num" value="${num}">
<table border="1">
<tr>
   <th colspan="2">�α���</th>
</tr>
<tr>
   <td>���̵�</td>
   <td><input type="text" name="id"></td>
</tr>
<tr>
   <td>��й�ȣ</td>
   <td><input type="password" name="pwd"></td>
</tr>
<tr>
   <th colspan="2">
   <input type="submit" value="���">
   <input type="reset" value="���">
   </th>
</tr>
</table>
</form>


</div><%--contenst ���� --%>
</div><%--wrap ���� --%>

</body>
</html>