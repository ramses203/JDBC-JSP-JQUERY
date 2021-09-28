package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import exam.Customer;

public class ExamModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Customer cust = new Customer();
		cust.setName(request.getParameter("name"));
		cust.setEmail(request.getParameter("email"));
		cust.setPhone(request.getParameter("phone"));
		request.setAttribute("customer", cust);
		
		Map<String, String> map = new HashMap<String, String>();
		String carname = "";
		String carMaker= "";
		if(cust.getName().equals("김길동")) {
			carname="그랜저";
			carMaker="현대 자동차";
		}else {
			carname="K3";
			carMaker="기아 자동차";
		}
		map.put("carname", carname);
		map.put("carMaker", carMaker);
		request.setAttribute("car", map);
		return new ActionForward("el1.jsp", false);
	}

}
