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
			<td>번호</td>
			<td>이미지</td>
			<td>제목</td>
			<td>작성자</td>
			<td>등록일</td>
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
						<option value="">검색타입</option>
						<option value="1">제목</option>
						<option value="2">내용</option>
						<option value="3">아이디</option>
					</select> 
					<input type="text" name="searchValue"> 
					<input type="submit" value="검색">
				</form>
			</th>
		</tr>


		<tr>
			<th colspan="5"><c:if test="${sessionScope.sessionID !=null}">
					<input type="button" value="새 글쓰기"
						onclick="location='main.kosmo?cmd=gallery&viewName=galleryForm'">
				</c:if></th>
		</tr>
	</table>


</div>
<%--contenst 종료 --%>
</div>
<%--wrap 종료 --%>
</body>
</html>