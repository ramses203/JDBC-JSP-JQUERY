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
    private Ex3ForModel model;  //멤버변수영역에 model변수 올려놓고
	
    public Ex3ForServlet() {    //디폴트 생성자 안에 작성하는 것은 우리가 클라이언트에게 
    							//요청(request)를 받을때 그때 딱 한번만 수행어야하는 작업을 넣는다.
    	model=new Ex3ForModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		try {
			int num=Integer.parseInt(request.getParameter("num"));
			System.out.println("num"+num);
			String res = model.mymakeTableTag(num);
			out.println("<h1>for문에제</h1>");
			out.println(res);
			
		} catch (Exception e) {
			out.println("정수로 입력하세요");
			out.println("<a href='form2.html'>이전</a>");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			out.close();
		}

	}}
