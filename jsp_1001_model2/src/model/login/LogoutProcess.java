package model.login;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.ActionForward;
import model.Action;

public class LogoutProcess implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// ���⼭�� ������ �����ִ¿���
		// �α׾ƿ�ó��
		// ���� ������ �ּҸ� �����´�. 
		HttpSession session = request.getSession(false);
		if(session != null){
			session.removeAttribute("sessionID");
		}
		return new ActionForward("main.kosmo?cmd=index", true);
	}

}
