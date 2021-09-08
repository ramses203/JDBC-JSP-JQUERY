package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/param2")
public class ExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 받아보기 (혼자연습)
		response.setContentType("text/html;charset=euc-kr");
		String msg = request.getParameter("msg");
		System.out.println("Parameter 값: " + msg);
		PrintWriter prWr = response.getWriter();
		if(msg.equals("red")) {
			prWr.println("사과");
		}
		else if(msg.equals("apple")) {
			prWr.println("맛있어");
		}
		else if(msg.equals("delicious")) {
			prWr.println("바나나");
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
