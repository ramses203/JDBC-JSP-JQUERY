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
			title : '���� ���� �÷����� 5�� ĳ���� �� �Ǽ� (����: %)',
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
          ['����', '�·�'],
          <c:forEach items='${totaldate}' var="item">
          [ '${item.GDATE}',${item.CNT} ],
          </c:forEach>
        ]);

        var options = {
          title: '�ֱ� ���� �·� (����: %)',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curvechart'));

        chart.draw(data, options);
      }
    </script>
    
<!-- ��Ʈ -->
<div class="chart_all"> 
	<div id="donutchart"></div>
	<div id="curvechart"></div>
</div>
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
			<th> NO </th>
			<th>����ID</th>
			<th>����ID</th>
			<th>è����</th>
			<th>������</th>
			<th>��ų</th>
			<th>������ ��¥</th>
			<th>K/D</th>
			<th>����</th>
			<th>��(RED/BLUE)</th>
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
				�¸�
				</c:when>
				<c:when test="${item.WIN == 'l' }">
				�й�
				</c:when>
			</c:choose>
			</td>
			<td><c:choose>
				<c:when test="${item.TEAM == 'b' }">
				BLUE��
				</c:when>
				<c:when test="${item.TEAM == 'r' }">
				RED��
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
			<th>���� ���� ����</th>
			<th>���� ���� Ƽ��</th>
		</tr>
		<c:forEach var="item" items='${tier }'>
		<tr>
			<td class="score">${item.SCORE }��</td>
			<td class="tooltips"><img src="resources/img/tier/${item.TIER }.jpg"><span class="tooltiptext tooltip-top">${item.TIER }</span></td>
		<tr>
		</c:forEach>
	</table>
</div>
</div>

