package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// hello == Tomcat ==> HelloServlet ����
// ServletContainer ���� ��ϵɼ��ִ� ��ü�� ���
public class HelloServlet extends HttpServlet{

	
	
	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// client output, Ŭ���̾�Ʈ�� �����ϴ� ��Ʈ�� 
		PrintWriter out = resp.getWriter();
		// ���������� �ش� ���ڿ��� �����Ѵ�. 
		out.println("<h1 style = 'color:red'>");
		String msg = "�ȳ��ϼ��� ���� ù��° ���� �Դϴ�.";
		out.println(msg);
		out.println("</h1>");
		out.close();
		
	}
	
	
	
}
