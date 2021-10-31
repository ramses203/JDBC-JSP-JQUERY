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
			<th class="caption">${id }</th>
		</tr>
	</table>
</div>
<c:choose>
	<c:when test="${addfriend == 'friend' }"><p class="fex"">ģ�� �Դϴ�.</p></c:when>
	<c:when test="${addfriend == 'friendrequest' }"><p class="fex">ģ����û�� ���½��ϴ�.</p></c:when>
	<c:when test="${addfriend == 'friendresponse' }">
		<form action="reqfrienduser" method="post" class="fex2">
			<input type="hidden" value="${id }" name="friendid" id="friendid"> 
			<input class="detailbtn" type="submit" value="��û ����">
		</form>
	</c:when>

	<c:when test="${addfriend == '' || addfriend == 'null'}">
		<div style="width: 80%; margin: 0 auto;">
			<form action="friendrequser" method="post" class="fex2">
				<input type="hidden" value="${id }" name="id" id="id"> 
				<input class="detailbtn" type="submit" value="ģ���߰�">
			</form>
		</div>
	</c:when>
</c:choose>
<div id="record">
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
