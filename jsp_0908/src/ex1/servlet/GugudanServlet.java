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
	// model�� ����ϱ����ؼ� �����ϱ�
	private GugudanModel model;
	
    public GugudanServlet() {
    model = new GugudanModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	response.setContentType("text/html;charset=euc-kr");
	
	// �� �Ķ���� �ޱ�
	try {
		int dan = Integer.parseInt(request.getParameter("dan"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		String color = request.getParameter("col");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	// model���� �ش�Ǵ� �޼��带 ȣ���ؼ� �����Ű�� out.println���� ȭ�鿡 ����ϱ�
	
	
}
