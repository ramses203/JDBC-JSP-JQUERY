package model.login;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.executor.ReuseExecutor;

import controller.ActionForward;
import model.Action;

public class LoginFormModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String subcmd = request.getParameter("subcmd");
		if(subcmd != null) {
			String viewName = request.getParameter("viewName");
			int num = Integer.parseInt(request.getParameter("num"));
			request.setAttribute("subcmd", subcmd);
			request.setAttribute("viewName", viewName);
			request.setAttribute("num", num);
		}
		
		return new ActionForward("login/loginForm.jsp", false);
	}

}
