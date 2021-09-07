package ex1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet 3.0부터 지원하는 어노테이션
@WebServlet("/life")
public class Ex1_LifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Ex1_LifeServlet() {
        System.out.println("생성자 호출");// 1. 처음에 한사람이 오면 생성자 호출되고
    }
	public void init(ServletConfig config) throws ServletException {	
		System.out.println("init 호출!");// 2. 그다음에 init 호출하고 
	}
	public void destroy() {	
		System.out.println("destroy 호출!");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);// 1. 여기서 제일먼저 doGet을 호출하고 나서 
		System.out.println("service 호출");  // 2. 서비스가 호출되고
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet호출!");
	}
}

// 처음에 클라이언트에서 호출이 오면 와스에서  
// service가 먼저 찍히는 이유는 super()에 의해 부모클래스의 생성자가 먼저 호출되기 때문입니다.
