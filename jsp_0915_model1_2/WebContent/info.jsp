<%@page import="dao.BoardDao"%>
<%@page import="dto.BoardDTO"%>
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

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
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

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
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

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
<script src="resources/js/comm.js"></script>
</head>
<body>

<div style="width: 800px; margin: auto;">
<div class="container">


<div class="row">
<div class="col-25">
<label for="title">제목</label>
</div>
<div class="col-75">
<input type="text" value="<%=vo.getTitle() %>" id="title" name="title" readonly="readonly">
</div>
</div>

<div class="row">
<div class="col-25">
<label  for="writer">작성자</label>
</div>
<div class="col-75">
<input type="text" value="<%=vo.getWriter() %>" id="writer" name="writer" readonly="readonly">
</div>
</div>

<div class="row">
<div class="col-25">
<label for="content">내용</label>
</div>
<div class="col-75">
<textarea id="content" name="content" readonly="readonly" style="height: 200px"><%=vo.getContent() %></textarea>
</div>
</div>

<div class="row">
<div class="col-25">
<label for="rdate">작성일</label>
</div>
<div class="col-75">
<input type="text" value="<%=vo.getRegdate() %>" id="rdate" name="rdate" readonly="readonly">
</div>
</div>

<div class="row" style="text-align: center">
<input type="button" value="수정" onclick="goUrl('modify.jsp?no='<%=vo.getNo()%>)">&nbsp;
<input type="button" value="삭제" onclick="goUrl('delete.jsp?no='<%=vo.getNo()%>)">&nbsp;
<input type="button" value="리스트" onclick="goUrl('list.jsp?')">&nbsp;
</div>

</div>
</div>



</body>
</html>







