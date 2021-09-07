package ex1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet 3.0���� �����ϴ� ������̼�
@WebServlet("/life")
public class Ex1_LifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Ex1_LifeServlet() {
        System.out.println("������ ȣ��");// 1. ó���� �ѻ���� ���� ������ ȣ��ǰ�
    }
	public void init(ServletConfig config) throws ServletException {	
		System.out.println("init ȣ��!");// 2. �״����� init ȣ���ϰ� 
	}
	public void destroy() {	
		System.out.println("destroy ȣ��!");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);// 1. ���⼭ ���ϸ��� doGet�� ȣ���ϰ� ���� 
		System.out.println("service ȣ��");  // 2. ���񽺰� ȣ��ǰ�
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGetȣ��!");
	}
}

// ó���� Ŭ���̾�Ʈ���� ȣ���� ���� �ͽ�����  
// service�� ���� ������ ������ super()�� ���� �θ�Ŭ������ �����ڰ� ���� ȣ��Ǳ� �����Դϴ�.
