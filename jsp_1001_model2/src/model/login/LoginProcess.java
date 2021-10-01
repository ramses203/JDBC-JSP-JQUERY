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
// lofinForm �Ķ����(id,pwd)�� �޾Ƽ�
// DTO�� �������� DAO�� �����ؼ�
// public int loginCheck(Member2DTO vo){

// }
//select count(*) cnt from member2 where id=#{id} and pwd=#{pwd}
// if else ����

public class LoginProcess implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Member2DTO vo = new Member2DTO();
		vo.setId(request.getParameter("id"));
		vo.setPwd(request.getParameter("pwd"));
		
		int cres = LoginDao.getDao().loginCheck(vo);
		//if(dbidx.equals(vo.getId()) && dbpwdx.equals(vo.getPwd())) {
		
		String basePath = "main.kosmo?cmd=index";
		if(cres > 0) {	
		System.out.println("�α��� ����");
			// �α׸� ���� �� ������ ����
			HttpSession session = request.getSession();
			session.setAttribute("sessionID", vo.getId());
			String subcmd = request.getParameter("subcmd");
			
			if(subcmd != null) {
				String viewName = request.getParameter("viewName");
				int num = Integer.parseInt(request.getParameter("num"));
				basePath = "main.kosmo?cmd="+subcmd+"&viewName="+viewName+"&num="+num;
			}
			
		}else {
			System.out.println("�α��� ����");
		}
		
		return new ActionForward(basePath, true);
	}

}
