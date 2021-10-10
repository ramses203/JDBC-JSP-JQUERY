package ex1;

import org.aspectj.lang.JoinPoint;

public class TodayBeforeAdvice {
	private MyPublic myPublic;
	

	public void setMyPublic(MyPublic myPublic) {
		this.myPublic = myPublic;
	}
	
	public void beforeToday(JoinPoint jp) {
		System.out.println("Target's address :"+jp.getTarget());
		System.out.println("Target's Name :"+jp.getSignature().getName());
		System.out.println(myPublic.todayMethod());
	}
}
