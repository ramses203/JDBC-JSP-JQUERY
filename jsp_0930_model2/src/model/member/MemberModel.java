package model.member;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.BoardDao;
import dao.Member2Dao;
import model.Action;
import vo.Member2DTO;

public class MemberModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String viewName = request.getParameter("viewName");
		String views = "";
		boolean methods = false;
		
		
		if(viewName.equals("memberForm")) {
			views = "member/"+ viewName +".jsp"; 
			methods = false;
		}else if(viewName.equals("memberIdChk")) {//memberIdChk
			//var param = "idv=" + id;
			String idv = request.getParameter("idv");
			System.out.println("idv :"+idv);
			int res = Member2Dao.getDao().memberId(idv); 
			
			request.setAttribute("res", res);
			views = "member/"+ viewName +".jsp"; 
			methods = false;
		}else if(viewName.equals("memberInsert")) {
			Member2DTO vo = new Member2DTO();
			Member2Dao dao = Member2Dao.getDao();
			vo.setId(request.getParameter("id"));
			vo.setPwd(request.getParameter("pwd"));
			vo.setName(request.getParameter("name"));
			vo.setAge(Integer.parseInt(request.getParameter("age")) );
			vo.setEmail(request.getParameter("email"));
			dao.insertMember(vo);
			
			views = "main.kosmo?cmd=index";
			methods = true;
			
		}
		
		return new ActionForward(views, methods);
	}
	

}
