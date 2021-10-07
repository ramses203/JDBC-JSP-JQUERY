package ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/Ex1_AutoServlet")
public class Ex1_AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ex1_AutoServlet() {
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
				new GenericXmlApplicationContext("ex2/ex1_auto.xml");
		Ex1_AutoWired ref = ctx.getBean("auto1",Ex1_AutoWired.class);
		request.setAttribute("msg", ref.getMessage());
		RequestDispatcher rd = 
				request.getRequestDispatcher("ex1_auto.jsp");
		rd.forward(request, response);
	}
}
