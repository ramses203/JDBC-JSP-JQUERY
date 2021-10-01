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
		// 여기서는 세션을 지워주는역할
		// 로그아웃처리
		// 기존 세션의 주소를 가져온다. 
		HttpSession session = request.getSession(false);
		if(session != null){
			session.removeAttribute("sessionID");
		}
		return new ActionForward("main.kosmo?cmd=index", true);
	}

}
