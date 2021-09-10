package ex1;

/*
 * ¿€º∫¿⁄ : ∏Ì∞«»Ò
 * √‚√≥ : ±Ë«¸πŒ
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkServletDetail")
public class CheckServletDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CheckDemoModel model; 
	
    public CheckServletDetail() {
    	model = new CheckDemoModel();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		int imgnum = Integer.parseInt(request.getParameter("imgnum"));
		
		String res = model.createImg(imgnum);
		out.println(res);
	}

}
