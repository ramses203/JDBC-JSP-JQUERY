package kr.co.kosmo.mvc.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
@Aspect
public class TodayAdvice {

		@Before("execution(* kr.co.kosmo.mvc.controller.*.*.*list(..))")
		public void beforeToday(JoinPoint jp) {
			System.out.println("test1:"+jp.getTarget().getClass().getName());
			System.out.println("test2:"+jp.getSignature().getName());
			Object[] fd = jp.getArgs();
			if(fd[0] instanceof Model) {
				Model m = (Model) fd[0];
				m.addAttribute("today",new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			}
		}
}
