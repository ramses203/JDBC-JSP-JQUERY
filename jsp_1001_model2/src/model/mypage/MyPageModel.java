package model.mypage;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.Member2Dao;
import model.Action;
import vo.Member2DTO;

public class MyPageModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String viewName = request.getParameter("viewName");
		boolean methods = false;
		String views = "";
		if (viewName.equals("myPageForm")) {
			views = "myPage/" + viewName + ".jsp";
			methods = false;
			String id = request.getParameter("id");
			Member2DTO vo = Member2Dao.getDao().myPage(id);
			request.setAttribute("vo", vo);
		}
		return new ActionForward(views, methods);
	}

}
