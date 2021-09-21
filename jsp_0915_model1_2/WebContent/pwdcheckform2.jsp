<%@page import="dto.BoardDTO"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    int no = Integer.parseInt(request.getParameter("no"));
    BoardDTO vo = BoardDao.getDao().info(no);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
* {
  box-sizing: border-box;
}
input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}
input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}
input[type=submit]:hover {
  background-color: #45a049;
}
label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}
.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
.row:after {
  content: "";
  display: table;
  clear: both;
}
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
</style>

</head>
<body>


<div style="width: 800px; margin: auto;">
<div class="container">
<form action="pwdcheck.jsp" method="post">

<input type="hidden" name="no" value="<%=vo.getNo()%>">
<div>
<h3>
정말로 삭제하시겠습니까?
</h3>
</div>

<div class="row">
<div class="col-25">
<label>비밀번호 확인</label>
</div>
<div class="col-75">
<input type="text" id="chkpwd" name="chkpwd">
</div>
</div>
<div class="row">
<input type="submit" value="Delete" name="Delete">
</div>
</form>


</div>
</div>
</body>
</html>