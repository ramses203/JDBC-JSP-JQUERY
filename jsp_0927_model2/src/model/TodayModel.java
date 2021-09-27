package model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public class TodayModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String msg = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
		request.setAttribute("tdate", msg);
		
		return new ActionForward("today.jsp", false);
	}

	
	
}
