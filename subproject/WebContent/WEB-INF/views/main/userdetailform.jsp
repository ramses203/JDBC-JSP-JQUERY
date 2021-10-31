<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<th class="caption">${id }</th>
		</tr>
	</table>
</div>
<c:choose>
	<c:when test="${addfriend == 'friend' }"><p class="fex"">친구 입니다.</p></c:when>
	<c:when test="${addfriend == 'friendrequest' }"><p class="fex">친구신청을 보냈습니다.</p></c:when>
	<c:when test="${addfriend == 'friendresponse' }">
		<form action="reqfrienduser" method="post" class="fex2">
			<input type="hidden" value="${id }" name="friendid" id="friendid"> 
			<input class="detailbtn" type="submit" value="요청 수락">
		</form>
	</c:when>

	<c:when test="${addfriend == '' || addfriend == 'null'}">
		<div style="width: 80%; margin: 0 auto;">
			<form action="friendrequser" method="post" class="fex2">
				<input type="hidden" value="${id }" name="id" id="id"> 
				<input class="detailbtn" type="submit" value="친구추가">
			</form>
		</div>
	</c:when>
</c:choose>
<div id="record">
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
