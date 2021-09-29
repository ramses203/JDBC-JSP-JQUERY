package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;

@WebServlet("*.kosmo")
public class ControllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}

	protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String cmd = request.getParameter("cmd");
		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			Action action = factory.getAction(cmd);
			ActionForward af = action.execute(request, response);
			if(af.isRedirect()) {
				response.sendRedirect(af.getNextPath());
			}else {
				String path = "WEB-INF/views/"+af.getNextPath();
				RequestDispatcher rd = request.getRequestDispatcher(path);
				rd.forward(request, response);
			}
		}else {
			response.setContentType("text/html;charset=euc-kr");
			response.sendRedirect("main.kosmo?cmd=index");
		}
	}	
}
