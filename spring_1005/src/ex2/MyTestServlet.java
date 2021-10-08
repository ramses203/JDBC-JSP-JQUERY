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

@WebServlet("/MyTestServlet")
public class MyTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MyTestServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		spring(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		spring(request, response);
	}
	//protected void nonspring(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String res = new MyAssembler().getPrintv();
		//request.setAttribute("msg", res);
		//RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		//rd.forward(request, response);
//	}
	
	
	protected void spring(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/mytest.xml");
		MyTestA ref  = ctx.getBean("MyT", MyTestA.class);
		String res = ref.printUseb();
		request.setAttribute("msg", res);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);
	}
}
