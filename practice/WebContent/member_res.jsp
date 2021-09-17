<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
  	  	response.setContentType("text/html;charset=euc-kr");
    	request.setCharacterEncoding("euc-kr");
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	StringBuilder email = new StringBuilder();
    	String email1 = request.getParameter("email1");
    	String email2 = request.getParameter("email2");
    	email.append(email1).append("@").append(email2);
    	// String email = email1 + "@" + email2;
    	StringBuilder phone = new StringBuilder();
    	String phone1 = request.getParameter("phone1");
    	String phone2 = request.getParameter("phone2");
    	String phone3 = request.getParameter("phone3");
    	phone.append(phone1).append("-").append(phone2).append("-").append(phone3);
    	StringBuilder socialNum = new StringBuilder();
    	String socialNum1 = request.getParameter("socialnum1");
    	String socialNum2 = request.getParameter("socialnum2");
    	socialNum.append(socialNum1).append("-").append(socialNum2);
    	
    	String minor = socialNum1; // 문자여에서 0~1까지의 문자열을 잘라서 저장
    	int intMinor = Integer.parseInt(minor); // 예) 2021 - 1994 => 121 - 94
    	String strMinor = null;
    	// 성년/미성년 기준 만 18세로 정함
    	if(121-intMinor>18){
    		strMinor = "성년입니다.";
    	} else {
    		strMinor = "미성년입니다.";
    	}
    	
    	String strSocialNum = null;
    	if(socialNum2.equals("1")||socialNum2.equals("3")){
    		strSocialNum = "남성";
    	} else {
    		strSocialNum = "여성";
    	} 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>member_res.jsp</title>
</head>
<body>	


	<table border="1">
	<th colspan="2"> 가입을 축하드립니다!	</th>
	<tr>
		<td>ID</td>
		<td><%=id %></td>
	</tr>
	<tr>
		<td>NAME</td>
		<td><%=name %></td>
	</tr>
	<tr>
		<td>EMAIL</td>
		<td><%=email %></td>
	</tr>
	<tr>
		<td>PHONE</td>
		<td><%=phone %></td>
	</tr>
  	<tr>
		<td>SOCIAL NUMBER</td>
		<td><%=socialNum %></td>
	</tr>

	 <tr>
		<td>GENDER</td>
		<td><%=strSocialNum %></td>
	</tr>
	<tr>
		<td>MINOR</td>
		<td><%=strMinor %></td>
	</tr> 
	</table>
</body>
</html>