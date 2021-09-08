package ex1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.model.Ex3ForModel;

@WebServlet("/ex3formdemo")
public class Ex3ForServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Ex3ForModel model;  //������������� model���� �÷�����
	
    public Ex3ForServlet() {    //����Ʈ ������ �ȿ� �ۼ��ϴ� ���� �츮�� Ŭ���̾�Ʈ���� 
    							//��û(request)�� ������ �׶� �� �ѹ��� �������ϴ� �۾��� �ִ´�.
    	model=new Ex3ForModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		try {
			int num=Integer.parseInt(request.getParameter("num"));
			System.out.println("num"+num);
			String res = model.mymakeTableTag(num);
			out.println("<h1>for������</h1>");
			out.println(res);
			
		} catch (Exception e) {
			out.println("������ �Է��ϼ���");
			out.println("<a href='form2.html'>����</a>");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			out.close();
		}

	}}
