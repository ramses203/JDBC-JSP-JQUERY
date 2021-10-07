package ex1;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TodayBeforeAdvice {
	@Autowired
	private MyPublic myPublic;
	
	public void beforeToday(JoinPoint jp) {
		Object[] args = jp.getArgs();
		System.out.println(args.length);
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getSignature().getClass().getCanonicalName());
		System.out.println(myPublic.todayMethod());
	}
}
