package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloHtmlServlet")
public class HelloHtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		String msg = "<h1>æ»≥Á«œººø‰</h1>";
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<meta charset=\"EUC-KR\">");
		sb.append("<title>Insert title here</title>");
		sb.append("<style> h1 {background-color: red;}</style>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append(msg);
		sb.append("</body>");
		sb.append("</html>");
		PrintWriter out = response.getWriter();
		out.print(sb.toString());
		out.close();
	
	
	}

}
