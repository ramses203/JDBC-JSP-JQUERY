<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="resources/css/css_multisearch.css">
<div id="searchbox">
	<form action="friendsearch" method="post">
		<input class="insert" type="text" id="friendid" name="friendid"
			placeholder="친구 아이디 입력"> <input class="search" type="submit"
			value="검색">
	</form>
</div>
<div class="multisearch_all">

	<div id="multisearch_line">
		<div class="multisearch_detail">
			<div class="multisearch_title">
				<table>
					<tr>
						<th>게임 ID</th>
						<th>이름</th>
						<th>친구추가 여부</th>
					</tr>
					<c:forEach var="m" items="${mvo }">
						<tr>
							<td><a href="userdetailform?id=${m.id }&addfriend=${m.addfriend}">${m.id}</a></td>
							<td>${m.uname}</td>
							<c:choose>
								<c:when test="${m.addfriend == null }">

									<td><form action="friendreq" method="post">
											<input type="hidden" value="${m.id }" name="id" id="id">
											<input class="addbtn" type="submit" value="친구추가">
										</form></td>
								</c:when>
								<c:when test="${m.addfriend == 'friend' }">
								<td><span class="addbtn">친구입니다.</span></td>
								</c:when>
								<c:when test="${m.addfriend == 'friendrequest' }">
								<td><span class="addbtn">친구신청을 보냈습니다.</span></td>
								</c:when>
								<c:when test="${m.addfriend == 'friendresponse' }">
								<td><span class="addbtn">친구요청이 왔습니다.</span></td>
								</c:when>
							</c:choose>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</div>







