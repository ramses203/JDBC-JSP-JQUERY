<%@page import="lol.mvc.controller.RecommendController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="lol.mvc.dto.RecommendVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="main">
	<div class="main_detail">
		<!-- �ۼ� ���� -->
		<div class="line line2">
			<div class="recommend_title2">
				<H1 class="caption">��Ī ��õ</H1>
			</div>
			<c:forEach var="e" items="${listary }">
				<div id="recommend_line">
					<div class="recommend_detail">
						<table>
							<tr>
								<th>���θ�</th>
								<th>���̵�</th>
								<th>è����</th>
								<th>���ھ�</th>
							</tr>
							<c:forEach var="i" items="${e }">
								<tr>
									<c:if test="${i.userLine == 'T'}">
										<td>ž</td>
									</c:if>
									<c:if test="${i.userLine == 'M'}">
										<td>�̵�</td>
									</c:if>
									<c:if test="${i.userLine == 'S'}">
										<td>����Ʈ</td>
									</c:if>
									<c:if test="${i.userLine == 'B'}">
										<td>����</td>
									</c:if>
									<c:if test="${i.userLine == 'J'}">
										<td>����</td>
									</c:if>
									<td>
										<form action="recommenduserdetail" method="post">
											<input type="hidden" value="${i.puid }" name="friendid" id="friendid"> 
											<input class="id" type="submit" value="${i.puid }">
										</form>
									</td>
									<td>${i.pcname }</td>
									<td>${i.score }��</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="line line3">
			<div class="recommend_title2">
				<H1 class="caption">���κ� ĳ���� ��õ</H1>
				<!-- ��ü �Ǽ��� ���� ĳ���� ��õ -->
			</div>
			<c:forEach var="u" items="${listrank }">
			<div id="recommend_line">
				<div class="recommend_detail">
					<table>
						<tr>
							<th>���θ�</th>
							<th>è����</th>
							<th>�·�</th>
							<th>��ü�Ǽ�</th>
							<th>K/DRatio</th>
						</tr>
		
		
						<c:forEach var="i" items="${u }">
							<tr>
		
								<c:if test="${i.userLine == 'T'}">
									<td>ž</td>
								</c:if>
								<c:if test="${i.userLine == 'M'}">
									<td>�̵�</td>
								</c:if>
								<c:if test="${i.userLine == 'S'}">
									<td>����Ʈ</td>
								</c:if>
								<c:if test="${i.userLine == 'B'}">
									<td>����</td>
								</c:if>
								<c:if test="${i.userLine == 'J'}">
									<td>����</td>
								</c:if>
								<td>${i.pcname }</td>
								<td>${i.winrate }%</td>
								<td>${i.picktotal }��</td>
								<td>${i.kdratio }</td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>
		</c:forEach>
		<!-- �ۼ� ���� -->
	</div>
</div>
</div>