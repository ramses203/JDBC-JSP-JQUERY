package ex1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1FormDemo
 */
@WebServlet("/ex1formdemo")
public class Ex1FormDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// MIMEŸ�� �� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		// ��û ��ü �޾Ƽ� ���
		String idv = request.getParameter("id");
		String pwdv = request.getParameter("pwd");
		String agev = request.getParameter("age");
		String mycolv = request.getParameter("mycol");
		String websitev = request.getParameter("website");
		String mydata1v = request.getParameter("mydate1");
		String mydata2v = request.getParameter("mydate2");
		String mydata3v = request.getParameter("mydate3");
		String mytimev = request.getParameter("id");
		String namev = request.getParameter("name");
		//���� ��ü
		PrintWriter out = response.getWriter();
		out.println("<div style=\"background:"+request.getParameter("mycol")+"\">");
		out.println("<h1>�� �޴� ��</h1>");
		out.println("<p>���̵�:" + idv + "</p>");
		out.println("<p>��й�ȣ:" + pwdv + "</p>");
		out.println("<p>����:" + agev + "</p>");
		out.println("<p>�̸�:" + namev + "</p>");
		out.println("<p>�����ϴ� ����:" + mycolv + "</p>");
		out.println("<p>��ȣ url:" + websitev + "</p>");
		out.println("<p>�����ϴ� ��¥1:" + mydata1v + "</p>");
		out.println("<p>�����ϴ� ��¥2:" + mydata2v + "</p>");
		out.println("<p>�����ϴ� ��¥3:" + mydata3v + "</p>");
		out.println("<p>�����ϴ� �ð�1:" + mytimev + "</p>");
		out.println("</div>");
		out.close();
		
	}

}
