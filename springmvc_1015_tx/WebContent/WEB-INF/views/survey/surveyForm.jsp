<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="surveyInsert" method="post">
		<table style="border-collapse: collapse; width: 450px; margin: auto">
			<thead>
				<tr>
					<td colspan="2" style="background: #ff9933">설문 작성 폼</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>번호</td>
					<td><input type="text" name="num" id="num"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="sub" id="sub"></td>
				</tr>
				<tr>
					<td>문항수</td>
					<td><input type="number" name="code" id="code" max="5" min="1"
						value="1" onchange="increTitle()"></td>
				</tr>
				<tr>
					<td id="target" colspan="2"></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2"><input type="submit" value="send">&nbsp;<input
						type="button" value="list" onclick="location='surveylist"></th>
					</tr>
			</tfoot>
		</table>
	</form>
	<script>
		function increTitle(){
			var code = parseInt(document.getElementById("code").value,"10");
			console.log(code);
			var html ="";
			for(var i=1;i<=code;i++){
				html += "<th>설문문항"+i+"</th><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"surveytitle\" id=\"surveytitle\"></td><br>";
			}
			document.getElementById("target").innerHTML=html;
		}
	</script>
</body>
</html>