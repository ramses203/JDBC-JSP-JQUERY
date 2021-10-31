<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>

<!-- ���̺� -->
<div id="title">
	<table>
		<tr>
			<th class="caption">${sessionID }</th>
		</tr>
	</table>
</div>
<div id="record">
	<table>
		<tr class="head">
			<th>��¥</th>
			<th>����ID</th>
			<th>���� IP</th>
			<th>��� ������</th>
			<th>�۾� ����</th>
		</tr>
		<c:forEach var="item" items='${volist }'>
		<tr class="content">
			<td>${item.sstime } </td>
			<td>${item.idn }</td>
			<td>${item.reip }</td>
			<c:set var="str" value="${item.uagent }"/>
			<td><c:choose>
			<c:when test="${fn:contains(str, 'Edg')}">
			���� ������</c:when>
			<c:when test="${fn:contains(str, 'Trident')}">
			IE ������</c:when>
			<c:when test="${fn:contains(str, 'Chrome')}">
			���� ������</c:when>
			<c:otherwise>��Ÿ ������</c:otherwise>
			</c:choose></td>
			<td>${item.status }</td>
		</tr>
		</c:forEach>
	</table>
<%--
	<table style="clear: both;">
		<tr>
			<td colspan="10" id="pageTd"><%@include file="pageProcess.jsp"%>
			</td>
		</tr>
	</table>
 --%>
</div>

