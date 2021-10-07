package ex3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/Ex1_ResourceServlet")
public class Ex1_ResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ex1_ResourceServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}
	protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex3/ex3_res.xml");
		Ex1_Resource ref = ctx.getBean("ex3",Ex1_Resource.class);
		request.setAttribute("msg", ref.getRes().resource1());
		RequestDispatcher rd = 
				request.getRequestDispatcher("ex1_auto.jsp");
		rd.forward(request, response);
	}
}
