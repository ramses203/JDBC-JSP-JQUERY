<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>Gallery �ۼ��ϱ� ȭ���Դϴ�.</h2>
</div>
<form method="post" action="fileup.kos"  enctype="multipart/form-data">
<input type="hidden" name="cmd"  value="galleryInsert">
<input type="hidden" name="reip"  value="<%=request.getRemoteAddr()%>">


<table border="1">
<tr>
   <th colspan="2">Gallery �ۼ��ϱ�</th>
</tr>
<tr>
   <td>����</td>
   <td><input type="text" name="subject"></td>
</tr>
<tr>
   <td>�ۼ���</td>
   <td><input type="text" name="wid"></td>
</tr>
<tr>
   <td>����</td>
   <td><textarea name="cont"></textarea></td>
</tr>
<tr>
   <td>�̹���</td>
   <td><input type="file" name="imgn"></td>
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