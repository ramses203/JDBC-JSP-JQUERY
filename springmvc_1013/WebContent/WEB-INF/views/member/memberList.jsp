<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp"%>
<div id="content">
<div style="width: 450px; margin: auto" >

<table>

<thead>
	<tr><th colspan="4">Today : ${today }</th></tr>
	<tr><th>��ȣ</th><th>���̵�</th><th>�̸�</th><th>���Գ�¥</th></tr>
	
</thead>
<tfoot>
<tr><th colspan="4">
<input type="button" value="ȸ��������" id="btn1">
</th></tr>
</tfoot>
<tbody>
<c:forEach var="vo" items="${list }">

<tr>
<td>${vo.num }</td>
<td>${vo.id }</td>
<td>${vo.name }</td>
<td>${vo.mdate }</td>
</tr>
</c:forEach>
</tbody>


</table>

</div>
</div>	
</body>
</html>















