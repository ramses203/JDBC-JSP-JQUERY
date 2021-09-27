package model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;

public class MyProfileModel implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String msg = "나의 프로필은 가나다라마바사";
		
		request.setAttribute("msg", msg);
		
		return new ActionForward("MyProfile.jsp", false);
	}

}
