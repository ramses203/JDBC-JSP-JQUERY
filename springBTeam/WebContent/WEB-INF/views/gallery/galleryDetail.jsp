<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>Gallery �ۼ��ϱ� ȭ���Դϴ�.</h2>
</div>

<table border="1">
<tr>
   <th colspan="2">Gallery �󼼺���</th>
</tr>
<tr>
   <td>����</td>
   <td><input type="text" name="subject" value="${vo.subject }" readonly="readonly"></td>
</tr>
<tr>
   <td>�ۼ���</td>
   <td><input type="text" name="wid" value="${vo.wid }" readonly="readonly"></td>
</tr>
<tr>
   <td>����</td>
   <td><textarea name="cont" readonly="readonly">${vo.cont }</textarea></td>
</tr>
<tr>
   <td>�̹���</td>
   <td>
   <img src="Upload/${vo.imgn }" style="width: 180px">
   </td>
</tr>
<tr>
   <th colspan="2"><input type="submit" value="���">
   <input type="button" value="����Ʈ" onclick="location='main.kosmo?cmd=gallery&viewName=galleryList'">
   <input type="button" value="����">
   <input type="button" value="����">
   </th>
</tr>
</table>

</div><%--contenst ���� --%>
</div><%--wrap ���� --%>
</body>
</html>