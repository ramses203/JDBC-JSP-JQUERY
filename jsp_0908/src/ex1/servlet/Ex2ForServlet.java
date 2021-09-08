package ex1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.model.Ex2ForModel;


@WebServlet("/ex2formdemo")
public class Ex2ForServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Ex2ForModel model;
	
	// 초기화,서블릿 아키택쳐에서의 초기화 의미를 복습! ***
	public Ex2ForServlet() {
		model=new Ex2ForModel();
	}
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		try {
			int num=Integer.parseInt(request.getParameter("num"));
			String msg = request.getParameter("msg");
			System.out.println("num"+num);
			System.out.println("msg"+msg);
			String res = model.mymakeTableTag(num);
			String res1 = model.mymakeTableTag2(1, msg);
			out.println("<h1>for문예제</h1>");
			out.println(res);
			out.println(res1);
		} catch (Exception e) {
			out.println("정수로 입력하세요");
			out.println("<a href='form2.html'>이전</a>");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			out.close();
		}
		
		
		
		
	}

}
