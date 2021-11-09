package ex1;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/roboService")
public class RoboAjaxService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoboDog rd;
	
	public RoboAjaxService() {
		rd = new RoboDog();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 값 - on, off
		response.setContentType("text/html;charset=euc-kr");
		String status = request.getParameter("status");
		PrintWriter out = response.getWriter();
		rd.onOff(status.toLowerCase());
		String res = "♥"+status+"♥";
		out.println(res);
		out.close();
	}

}
