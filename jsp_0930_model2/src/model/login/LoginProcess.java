package model.login;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.ActionForward;
import dao.LoginDao;
import model.Action;
import vo.Member2DTO;
// loginForm -> ContreollServlet -> ActionFActory
// >> LofinProcess
// lofinForm 파라미터(id,pwd)를 받아서
// DTO에 저장한후 DAO로 전달해서
// public int loginCheck(Member2DTO vo){

// }
//select count(*) cnt from member2 where id=#{id} and pwd=#{pwd}
// if else 결정

public class LoginProcess implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Member2DTO vo = new Member2DTO();
		vo.setId(request.getParameter("id"));
		vo.setPwd(request.getParameter("pwd"));
		
		int cres = LoginDao.getDao().loginCheck(vo);
		//if(dbidx.equals(vo.getId()) && dbpwdx.equals(vo.getPwd())) {
		if(cres > 0) {	
		System.out.println("로그인 인증");
			// 로그린 인증 후 세션을 저장
			HttpSession session = request.getSession();
			session.setAttribute("sessionID", vo.getId());
		}else {
			System.out.println("로그인 실패");
		}
		
		return new ActionForward("main.kosmo?cmd=index", true);
	}

}
