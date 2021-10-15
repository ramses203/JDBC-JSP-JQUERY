<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="surveyInsert">
	<table style="border-collapse: collapse; width: 450px; margin: auto;">
		<thead>
			<tr>
				<th colspan="2" style="background: #ff9933">설문 작성 폼</th></tr>
		</thead>
	<tbody>
		<tr><th>번호</th>
			<td><input type="text" name="num" id="num"></td></tr>
			<tr><th>제목</th>
			<td><input type="text" name="sub" id="sub"></td></tr>
			<tr><th>문항수</th>
			<td><input type="number" name="code" id="code" max="5" min="1" value="1" onchange="increTitle()"></td></tr>
			<tr>
			<td id="target" colspan="2">
			</td></tr>
	</tbody>
	<tfoot>
	<tr><th colspan="2"><input type="submit" value="send">&nbsp; 
	<input type="button" value="list" onclick="location='surveylist'"></th></tr>
	</tfoot>
	</table>
</form>
<script type="text/javascript">
	function increTitle() {
		var code = parseInt(document.getElementById("code").value,"10");
		console.log(code);
		var html="";
		for(var i=1; i<=code; i++){
			html += "<th>설문문항"+i +"</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"surveytitle\" id=\"surveytitle\"></td><br>";
		}
		document.getElementById("target").innerHTML=html;
	}
</script>

</body>
</html>