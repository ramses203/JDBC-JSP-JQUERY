<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="content">
	<table>
		<tr>
			<th colspan="5">Gallery List</th>
		</tr>
		<tr>
			<td>��ȣ</td>
			<td>�̹���</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>�����</td>
		</tr>

		<c:forEach var="vo" items="${glist }">
			<tr>
				<td>${vo.num }</td>
				<td style="text-align: center"><img src="Upload/${vo.imgn }"
					style="width: 100px;"></td>
				<td><c:choose>
						<c:when test="${sessionScope.sessionID == null}">
							<a href="main.kosmo?cmd=loginForm&subcmd=gallery&viewName=galleryDetail&num=${vo.num }">
								${vo.subject }</a>		
						</c:when>
						<c:otherwise>
							<a href="main.kosmo?cmd=gallery&viewName=galleryDetail&num=${vo.num }">
								${vo.subject }</a>
						</c:otherwise>
					</c:choose></td>

				<td>${vo.wid }</td>
				<td>${vo.gdate }</td>
			</tr>
		</c:forEach>

		<tr>
			<th colspan="5">
				<form action="main.kosmo" method="post">
					<input type="hidden" name="cmd" value="gallery"> 
					<input type="hidden" name="viewName" value="galleryList"> 
					<select	name="searchType">
						<option value="">�˻�Ÿ��</option>
						<option value="1">����</option>
						<option value="2">����</option>
						<option value="3">���̵�</option>
					</select> 
					<input type="text" name="searchValue"> 
					<input type="submit" value="�˻�">
				</form>
			</th>
		</tr>


		<tr>
			<th colspan="5"><c:if test="${sessionScope.sessionID !=null}">
					<input type="button" value="�� �۾���"
						onclick="location='main.kosmo?cmd=gallery&viewName=galleryForm'">
				</c:if></th>
		</tr>
	</table>


</div>
<%--contenst ���� --%>
</div>
<%--wrap ���� --%>
</body>
</html>