package ex1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.model.GugudanModel;

@WebServlet("/gugudanPorcess")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// model을 사용하기위해서 생성하기
	private GugudanModel model;
	
    public GugudanServlet() {
    model = new GugudanModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	response.setContentType("text/html;charset=euc-kr");
	
	// 폼 파라미터 받기
	try {
		int dan = Integer.parseInt(request.getParameter("dan"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		String color = request.getParameter("col");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	// model에서 해당되는 메서드를 호출해서 적용시키고 out.println으로 화면에 출력하기
	
	
}
