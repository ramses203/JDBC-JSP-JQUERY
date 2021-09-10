package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1_Config_ContextServletDemo extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String company;
	private String email;
	private String tel;
	
	
	@Override
	public void init() throws ServletException {
		// 
		company = getServletContext().getInitParameter("company");
		email = getServletConfig().getInitParameter("email");
		tel = getServletConfig().getInitParameter("tel");
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter out = resp.getWriter();
		
		out.print("<ul><li>회사명 : " + company);
		out.print("<li>전화번호: " + tel);
		out.print("<li>이메일: " + email);
	
	}
}
