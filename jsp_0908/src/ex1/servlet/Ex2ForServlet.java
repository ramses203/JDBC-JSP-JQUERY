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
	
	// �ʱ�ȭ,���� ��Ű���Ŀ����� �ʱ�ȭ �ǹ̸� ����! ***
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
			out.println("<h1>for������</h1>");
			out.println(res);
			out.println(res1);
		} catch (Exception e) {
			out.println("������ �Է��ϼ���");
			out.println("<a href='form2.html'>����</a>");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			out.close();
		}
		
		
		
		
	}

}
