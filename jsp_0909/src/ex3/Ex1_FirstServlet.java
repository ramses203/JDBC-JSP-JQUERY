package ex3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex1_FirstServlet")
public class Ex1_FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstServlet 수행됨");
		// forward를 사용해서 값을 전달하는방법
		request.setAttribute("msg", "hello");
		
		
		//1. forward 방식으로 이동
		//RequestDispatcher rd = request.getRequestDispatcher("second");
		//rd.forward(request, response);
		//2.redirect 방식으로 이동
		response.sendRedirect("second");
	}

	
}
