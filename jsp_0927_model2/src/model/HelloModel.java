package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public class HelloModel implements Action{	//�������̽� Action�� model���� �����Ұ��̴�.

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
			String msg = "�ȳ��ϼ��� ���� ù �� 2�Դϴ�."; // �𵨿��� ���� ������ redirect�� ������ �ȵǰ� forward������� ������ �Ѵ�. �׷��� ���� �������� �ʱ� ������
												  //�� model�� ������� controllerServlet�� ���ؼ� view�� ������.
			request.setAttribute("msg", msg);	  // �𵨿��� request.setAttribute�� ���� �ɾ���� ������ view���� request.getAttribute�� ������� �̾�����Ѵ�. 
			
		
		return new ActionForward("hello.jsp", false);//true�� redirect false�� forward������� ���� ������ �ȴ�. 
	}

}
