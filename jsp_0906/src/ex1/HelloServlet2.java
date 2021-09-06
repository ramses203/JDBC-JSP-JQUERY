package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author ria
 */

public class HelloServlet2 extends HttpServlet{
	
	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */

	
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws 
	ServletException, IOException	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Date date = new Date();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Servlet !");
		out.println("<br>");
		out.println("오늘 날짜는" + date + "입니다.");
		out.println("</body>");
		out.println("</html>");
	}

	
	
	// <editor-fold defaultstate=" collapsed desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}
	
	/**
	 * Handles the HTTP <code>POST</code> method.
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}



	
		
	



	/**
	 * Returns a short description of the servlet.
	 * @return a String containing servlet description
	 */
	
	
	@Override
	public String getServletInfo() {
		
		return "Short description";
	}//</editor-fold>
	
	}
	


	

	
	
	
	

