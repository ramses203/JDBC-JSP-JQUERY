<%@page import="lol.mvc.controller.RecommendController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="lol.mvc.dto.RecommendVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="main">
	<div class="main_detail">
		<!-- 작성 시작 -->
		<div class="line line2">
			<div class="recommend_title2">
				<H1 class="caption">매칭 추천</H1>
			</div>
			<c:forEach var="e" items="${listary }">
				<div id="recommend_line">
					<div class="recommend_detail">
						<table>
							<tr>
								<th>라인명</th>
								<th>아이디</th>
								<th>챔프명</th>
								<th>스코어</th>
							</tr>
							<c:forEach var="i" items="${e }">
								<tr>
									<c:if test="${i.userLine == 'T'}">
										<td>탑</td>
									</c:if>
									<c:if test="${i.userLine == 'M'}">
										<td>미드</td>
									</c:if>
									<c:if test="${i.userLine == 'S'}">
										<td>서포트</td>
									</c:if>
									<c:if test="${i.userLine == 'B'}">
										<td>원딜</td>
									</c:if>
									<c:if test="${i.userLine == 'J'}">
										<td>정글</td>
									</c:if>
									<td>
										<form action="recommenduserdetail" method="post">
											<input type="hidden" value="${i.puid }" name="friendid" id="friendid"> 
											<input class="id" type="submit" value="${i.puid }">
										</form>
									</td>
									<td>${i.pcname }</td>
									<td>${i.score }점</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="line line3">
			<div class="recommend_title2">
				<H1 class="caption">라인별 캐릭터 추천</H1>
				<!-- 전체 판수에 대한 캐릭터 추천 -->
			</div>
			<c:forEach var="u" items="${listrank }">
			<div id="recommend_line">
				<div class="recommend_detail">
					<table>
						<tr>
							<th>라인명</th>
							<th>챔프명</th>
							<th>승률</th>
							<th>전체판수</th>
							<th>K/DRatio</th>
						</tr>
		
		
						<c:forEach var="i" items="${u }">
							<tr>
		
								<c:if test="${i.userLine == 'T'}">
									<td>탑</td>
								</c:if>
								<c:if test="${i.userLine == 'M'}">
									<td>미드</td>
								</c:if>
								<c:if test="${i.userLine == 'S'}">
									<td>서포트</td>
								</c:if>
								<c:if test="${i.userLine == 'B'}">
									<td>원딜</td>
								</c:if>
								<c:if test="${i.userLine == 'J'}">
									<td>정글</td>
								</c:if>
								<td>${i.pcname }</td>
								<td>${i.winrate }%</td>
								<td>${i.picktotal }판</td>
								<td>${i.kdratio }</td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>
		</c:forEach>
		<!-- 작성 종료 -->
	</div>
</div>
</div>