package lol.mvc.aop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.bridge.MessageUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class loginChkAop {

	/*
	 * @Pointcut("execution(* lol.mvc.controller.*.*(..))" ) public void loginauth()
	 * {}
	 * 
	 * @Before("loginauth()") public void commonAuth(JoinPoint joinPoint){ Object[]
	 * obj = joinPoint.getArgs(); //request,response,session HttpSession session =
	 * (HttpSession)obj[2];
	 * 
	 * try { if(session.getAttribute("id")!=null) { //�α��������� ������ -> �Ѱܳ�����. �α��� ��������.
	 * HttpServletRequest request = (HttpServletRequest)obj[0]; HttpServletResponse
	 * response = (HttpServletResponse)obj[1];
	 * if(request.getRequestURL().toString().contains("login")||
	 * request.getRequestURL().toString().contains("logout")||
	 * request.getRequestURL().toString().contains("landing")) {return;} //������������
	 * mainpage�� ������. PrintWriter writer; writer = response.getWriter();
	 * writer.print("<script>"); writer.print("location.href='login';");
	 * writer.print("</script>"); writer.close(); }//������ ���� } catch (IOException e)
	 * { e.printStackTrace(); } }
	 */
}
