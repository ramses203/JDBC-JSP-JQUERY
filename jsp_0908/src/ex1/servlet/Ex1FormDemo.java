package ex1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1FormDemo
 */
@WebServlet("/ex1formdemo")
public class Ex1FormDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// MIME타입 및 인코딩
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		// 요청 객체 받아서 출력
		String idv = request.getParameter("id");
		String pwdv = request.getParameter("pwd");
		String agev = request.getParameter("age");
		String mycolv = request.getParameter("mycol");
		String websitev = request.getParameter("website");
		String mydata1v = request.getParameter("mydate1");
		String mydata2v = request.getParameter("mydate2");
		String mydata3v = request.getParameter("mydate3");
		String mytimev = request.getParameter("id");
		String namev = request.getParameter("name");
		//응답 객체
		PrintWriter out = response.getWriter();
		out.println("<div style=\"background:"+request.getParameter("mycol")+"\">");
		out.println("<h1>폼 받는 곳</h1>");
		out.println("<p>아이디:" + idv + "</p>");
		out.println("<p>비밀번호:" + pwdv + "</p>");
		out.println("<p>나이:" + agev + "</p>");
		out.println("<p>이름:" + namev + "</p>");
		out.println("<p>좋아하는 색상:" + mycolv + "</p>");
		out.println("<p>선호 url:" + websitev + "</p>");
		out.println("<p>좋아하는 날짜1:" + mydata1v + "</p>");
		out.println("<p>좋아하는 날짜2:" + mydata2v + "</p>");
		out.println("<p>좋아하는 날짜3:" + mydata3v + "</p>");
		out.println("<p>좋아하는 시간1:" + mytimev + "</p>");
		out.println("</div>");
		out.close();
		
	}

}
