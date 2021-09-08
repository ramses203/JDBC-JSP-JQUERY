package ex1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.model.Ex3FormProcModel;

@WebServlet("/ex3FormProc")
public class Ex3FormProcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// step1) model 을 사용하기 위해서 생성
    private Ex3FormProcModel model;   
	
    public Ex3FormProcServlet() {
    	model = new Ex3FormProcModel();
    }
    // step2) 폼파라미터 받기
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=euc-kr");
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String oper = request.getParameter("oper");
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(oper);
	
	PrintWriter out = response.getWriter();
	if(oper.equals("+")) {
		out.println(num1+" "+oper + " " + num2 +"="+ model.addProc(num1, num2));
	}else if(oper.equals("-"));
	}

}
