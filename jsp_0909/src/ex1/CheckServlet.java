package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheckDemoModel model;
    public CheckServlet() {
    	model = new CheckDemoModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");//response.setContentType을 적어주지 않아서 오류가 났음
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		// 배열로 담아서 파라미터 올 경우
		String[] fruit = request.getParameterValues("fruit");
//		System.out.println(gender);
//		System.out.println(phone);
		
		String res = model.createTag(gender, phone, fruit);
		// 출력층
		PrintWriter out = response.getWriter();//PrintWriter를 작성하지 않아서 오류가났음 
		out.println(res);
		out.close();
	}

}
