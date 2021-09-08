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
	// step1) model�� ����ϱ� ���ؼ� ����
	private Ex3FormProcModel model;

	public Ex3FormProcServlet() {
		model = new Ex3FormProcModel();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		// step2) �� �Ķ���� �ޱ�
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String oper = request.getParameter("oper");
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(oper);

		PrintWriter out = response.getWriter();
		// step3) model���� �ش�Ǵ� �޼��带 ȣ���ؼ� addProc()��� �� ����� ��ȯ�޾Ƽ�
		// �������� ǥ�� [out.println]
		if (oper.equals("+")) {
			out.println(num1 + " " + oper + " " + num2 + "=" + model.addProc(num1, num2)[0]);
			out.print("����Ʈ��  " + model.addProc(num1, num2)[1]);
		} else if (oper.equals("*")) {
			out.println(num1 + " " + oper + " " + num2 + "=" + model.timProc(num1, num2)[0]);
			out.print("����Ʈ��  " + model.timProc(num1, num2)[1]);
		} else if (oper.equals("/")) {
			out.println(num1 + " " + oper + " " + num2 + "=" + model.divProc(num1, num2)[0]);
			out.print("����Ʈ��  " + model.divProc(num1, num2)[1]);
		} else if (oper.equals("-")) {
			out.println(num1 + " " + oper + " " + num2 + "=" + model.subProc(num1, num2)[0]);
			out.print("����Ʈ��  " + model.subProc(num1, num2)[1]);
		}

		}
		}
