package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public class bookModel implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String msg = "책의 종류는...";
		
		request.setAttribute("msg", msg);
		
		return new ActionForward("book.jsp", false);
	}
}
