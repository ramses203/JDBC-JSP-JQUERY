<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>�Խù� �ۼ��ϱ� ȭ���Դϴ�.</h2>
</div>
<form method="post" action="main.kosmo">
<input type="hidden" name="cmd"  value="board">
<input type="hidden" name="viewName"  value="boardInsert">

<table border="1">
<tr>
   <th colspan="2">�Խù� �ۼ��ϱ�</th>
</tr>
<tr>
   <td>����</td>
   <td><input type="text" name="title"></td>
</tr>
<tr>
   <td>�ۼ���</td>
   <td><input type="text" name="writer"></td>
</tr>
<tr>
   <td>����</td>
   <td><textarea name="content"></textarea></td>
</tr>
<tr>
   <td>��й�ȣ</td>
   <td><input type="password" name="pwd"></td>
</tr>
<tr>
   <th colspan="2"><input type="submit" value="���">
   <input type="reset" value="���">
   </th>
</tr>
</table>
</form>


</div><%--contenst ���� --%>
</div><%--wrap ���� --%>
</body>
</html>