package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Action;
import model.Action2;

@WebServlet("*.kos")
public class ControllCosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllCosServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPro(request, response);
	}

	protected void doPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		// 파일 업로드 일경우 cmd를 잘받을수있도록 하자.
		//업로드 파일사이즈
		int fileSize = 5* 1024 * 1024;
		//업로드 경오
		String uploadPath = request.getServletContext().getRealPath("/Upload");
		System.out.println("uploadPath" + uploadPath);
		//파일 업로드 객체
		MultipartRequest multi = new MultipartRequest(request, uploadPath,fileSize,"euc-kr",new DefaultFileRenamePolicy());
		
		
		
		String cmd = multi.getParameter("cmd");
		System.out.println("ControllCosServlet:"+ cmd);
		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			Action2 action = factory.getAction2(cmd);
			ActionForward af = action.execute(multi, response);
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
