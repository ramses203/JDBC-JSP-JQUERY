<%@page import="java.sql.ResultSet"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("euc-kr");
String btnname = "Update";
BoardDao dao = BoardDao.getDao();
BoardDTO vo = new BoardDTO();
vo.setPwd(request.getParameter("chkpwd"));
vo.setNo(Integer.parseInt(request.getParameter("no")));
String rs = dao.check(vo.getNo());


if (btnname.equals(request.getParameter("Update"))) {

	if (rs.equals(vo.getPwd())) {
		response.sendRedirect("modify.jsp?no=" + vo.getNo());
	} else {
		response.sendRedirect("wrongpwdpage.jsp?no=" + vo.getNo());
	}

}

else {

	if (rs.equals(vo.getPwd())) {
		response.sendRedirect("delete.jsp?no=" + vo.getNo());
	} else {
		response.sendRedirect("wrongpwdpage2.jsp?no=" + vo.getNo());
	}

}
%>