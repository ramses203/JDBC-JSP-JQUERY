package ex1;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TodayBeforeAdvice {
	private MyPublic myPublic;
	
	public void setMyPublic(MyPublic myPublic) {
		this.myPublic = myPublic;
	}
	//
	public void beforeToday(JoinPoint jp) {
		System.out.println("Target :"+jp.getTarget());
		System.out.println("Name :"+jp.getSignature().getName());
		System.out.println(myPublic.todayMethod());
	}
//	public static void main(String[] args) {
//		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1_aop.xml");
//		TodayBeforeAdvice ref = ctx.getBean("beforeAdvice",TodayBeforeAdvice.class);
//		ref.beforeToday();
//	
//	}
}
