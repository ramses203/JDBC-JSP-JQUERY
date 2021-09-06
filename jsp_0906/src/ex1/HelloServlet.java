package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// hello == Tomcat ==> HelloServlet 실행
// ServletContainer 에게 등록될수있는 객체를 상속
public class HelloServlet extends HttpServlet{

	
	
	
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// client output, 클라이언트로 전송하는 스트림 
		PrintWriter out = resp.getWriter();
		// 웹브라우저로 해당 문자열을 전송한다. 
		out.println("<h1 style = 'color:red'>");
		String msg = "안녕하세요 나의 첫번째 서블릿 입니다.";
		out.println(msg);
		out.println("</h1>");
		out.close();
		
	}
	
	
	
}
