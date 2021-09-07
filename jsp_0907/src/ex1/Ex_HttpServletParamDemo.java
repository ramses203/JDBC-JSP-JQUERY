package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/param1")
public class Ex_HttpServletParamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 받아보기
		//http://localhost:9001/jsp_0907/param1?msg=member, guest
		response.setContentType("text/html;charset=euc-kr");
		String msg = request.getParameter("msg");
		System.out.println("Parameter 값: " + msg);
		PrintWriter out = response.getWriter();
		if(msg.equals("member")) {
			out.println("member join !");
		}else if(msg.equals("guest")) {
			out.println("guest join !");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
