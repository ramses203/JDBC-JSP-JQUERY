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
	response.setContentType("text/html;charset=euc-kr");
	String gender = request.getParameter("gender");
	String phone = request.getParameter("phone");
	String[] fruit = request.getParameterValues("fruit");
	
	String res = model.createTag(gender, phone, fruit);
	PrintWriter out = response.getWriter();
	out.println(res);
	out.close();
	
	
	
	
	
	
	
	}

}
