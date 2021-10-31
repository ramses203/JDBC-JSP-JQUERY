<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="resources/js/loader.js"></script>
<script type="text/javascript">
	google.charts.load("current", {
		packages : [ "corechart" ]
	});
	google.charts.setOnLoadCallback(drawChart);
	function drawChart() {
		var data = google.visualization.arrayToDataTable([
				[ 'Task', 'Hours per Day' ],
				<c:forEach items='${totalchap}' var="item">
				[ '${item.CHAMP}',${item.COUNT} ],
				</c:forEach>
				]);

		var options = {
			title : '가장 많이 플레이한 5개 캐릭터 별 판수 (단위: %)',
			pieHole : 0.4,
		};

		var chart = new google.visualization.PieChart(document
				.getElementById('donutchart'));
		chart.draw(data, options);
	}
</script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['시즌', '승률'],
          <c:forEach items='${totaldate}' var="item">
          [ '${item.GDATE}',${item.CNT} ],
          </c:forEach>
        ]);

        var options = {
          title: '최근 시즌별 승률 (단위: %)',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curvechart'));

        chart.draw(data, options);
      }
    </script>
    
<!-- 차트 -->
<div class="chart_all"> 
	<div id="donutchart"></div>
	<div id="curvechart"></div>
</div>
<!-- 테이블 -->
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
			<th> NO </th>
			<th>게임ID</th>
			<th>유저ID</th>
			<th>챔프명</th>
			<th>아이템</th>
			<th>스킬</th>
			<th>게임한 날짜</th>
			<th>K/D</th>
			<th>승패</th>
			<th>팀(RED/BLUE)</th>
		</tr>
		<c:forEach var="item" items='${recentstat }'>
		<tr class="content">
			<td>${item.R_NUM } </td>
			<td>${item.ROOMNO }</td>
			<td>${item.PUID }</td>
			<td class="tooltips"><img src="resources/img/champ/${item.PCNAME }.jpg"><span class="tooltiptext tooltip-top">${item.PCNAME }</span></td>
			<td class="tooltips"><img src="resources/img/item/${item.PINAME }.jpg"><span class="tooltiptext tooltip-top">${item.PINAME }</span></td>
			<td class="tooltips"><img src="resources/img/skill/${item.PSNAME }.jpg"><span class="tooltiptext tooltip-top">${item.PSNAME }</span></td>
			<td>${item.GDATE }</td>
			<td>${item.KILL }/${item.DEATH }</td>
			<td><c:choose>
				<c:when test="${item.WIN == 'w' }">
				승리
				</c:when>
				<c:when test="${item.WIN == 'l' }">
				패배
				</c:when>
			</c:choose>
			</td>
			<td><c:choose>
				<c:when test="${item.TEAM == 'b' }">
				BLUE팀
				</c:when>
				<c:when test="${item.TEAM == 'r' }">
				RED팀
				</c:when>
			</c:choose></td>
		</tr>
		</c:forEach>
	</table>
	<table style="clear: both;">
		<tr>
			<td colspan="10" id="pageTd"><%@include file="pageProcess.jsp"%>
			</td>
		</tr>
	</table>
<div id="rank">
	<table>
		<tr>
			<th>나의 현재 점수</th>
			<th>나의 현재 티어</th>
		</tr>
		<c:forEach var="item" items='${tier }'>
		<tr>
			<td class="score">${item.SCORE }점</td>
			<td class="tooltips"><img src="resources/img/tier/${item.TIER }.jpg"><span class="tooltiptext tooltip-top">${item.TIER }</span></td>
		<tr>
		</c:forEach>
	</table>
</div>
</div>

