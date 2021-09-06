package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html:chatset=euc-kr");
		
		
		
		PrintWriter out = response.getWriter();
		Date date = new Date();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Servlet !");
		out.println("<br>");
		out.println("오늘 날짜는" + date + "입니다.");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
}
