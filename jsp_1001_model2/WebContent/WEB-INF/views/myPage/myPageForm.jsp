<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>���������� ȭ���Դϴ�.</h2>
</div>
<table border="1">
<tr>
   <th colspan="2">MY Page</th>
</tr>
<tr>
   <td>ȸ������ ���̵�</td>
   <td><input type="text" name="id" value="${vo.id }" readonly="readonly"></td>
</tr>
<tr>
   <td>ȸ������ ����</td>
   <td><input type="text" name="name" value="${vo.name }" readonly="readonly"></td>
</tr>
<tr>
   <td>ȸ������ �̸���</td>
   <td><input type="text" name="email" value="${vo.email }" readonly="readonly"></td>
</tr>
<tr>
   <td>ȸ������ ����</td>
   <td><input type="text" name="age" value="${vo.age }" readonly="readonly"></td>
</tr>
<tr>
   <td>ȸ������ ��������</td>
   <td><input type="text" name="mdate" value="${vo.mdate }" readonly="readonly"></td>
</tr>
<tr>
   <th colspan="2">
   <input type="button" value="ȸ����������" onclick="location='main.kosmo?cmd=member&viewName=memberUpdate'">
   <input type="button" value="ȸ����������" onclick="location='main.kosmo?cmd=member&viewName=memberDelete'">
   </th>
</tr>
</table>

</div><%--contenst ���� --%>
</div><%--wrap ���� --%>
</body>
</html>