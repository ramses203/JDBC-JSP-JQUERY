package lol.mvc.aop;


import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lol.mvc.dao.MyPageInter;
import lol.mvc.dao.MyfriendInter;

@Component
@Aspect
public class loginChkAop {
	// session 검사 후 sessionID가 없을 경우 Login으로
	
	@Autowired
	private MyfriendInter myfriendInter; 
	
	@Around(value="execution(* lol.mvc.controller.*.*Form(..))")
	public String loginchk(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("loginchk");
		Object[] fd = pjp.getArgs();
		HttpSession session = (HttpSession) fd[0];
		if(session.getAttribute("sessionID")!=null) {
			String myid = (String) session.getAttribute("sessionID");
			String cnt = myfriendInter.friendCount(myid);
			session.setAttribute("friendmsg", cnt);
			String path = (String)pjp.proceed();
			System.out.println(path);
			return path;
		}
		return "redirect:/login";
	}
	
	
}
