package lol.mvc.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javassist.expr.Instanceof;
import lol.mvc.dao.LoggingInter;
import lol.mvc.dto.MyLoginLoggerDTO;

@Component
@Aspect
public class LoginAdvice {

	@Autowired
	private LoggingInter loggingInter;

	@Around("execution(* lol.mvc.controller.MyLoginController.mylog*(..))")
	public String loginLogger(ProceedingJoinPoint jp) {
		System.out.println("loginLogger");
		Object[] fd = jp.getArgs();
		String rpath = null;
		String methodName = jp.getSignature().getName();
		String userAgent = null;
		if (methodName.equals("myloginIn")) {
			System.out.println("myloginIn");
			try {
				userAgent = (String) fd[3];
				MyLoginLoggerDTO vo = new MyLoginLoggerDTO();
				rpath = (String) jp.proceed();
				if (fd[0] instanceof HttpSession && fd[1] instanceof HttpServletRequest) {
					HttpSession session = (HttpSession) fd[0];
					HttpServletRequest request = (HttpServletRequest) fd[1];
					String uid = (String) session.getAttribute("sessionID");
					if (uid != null) {
						vo.setIdn(uid);
						vo.setStatus("login");
						vo.setReip(request.getRemoteAddr());
						vo.setUagent(userAgent);
						loggingInter.addLoginLogging(vo);
					}
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
		} else if (methodName.equals("mylogout")) {
			System.out.println("mylogout");
			try {
				MyLoginLoggerDTO vo = new MyLoginLoggerDTO();
				if (fd[0] instanceof HttpSession && fd[1] instanceof HttpServletRequest) {
					HttpSession session = (HttpSession) fd[0];
					HttpServletRequest request = (HttpServletRequest) fd[1];
					userAgent = (String) fd[3];
					String uid = (String) session.getAttribute("sessionID");
					if (uid != null) {
						vo.setIdn(uid);
						vo.setStatus("logout");
						vo.setReip(request.getRemoteAddr());
						vo.setUagent(userAgent);
						loggingInter.addLoginLogging(vo);
					}
				}
				rpath = (String) jp.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		return rpath;
	}

}