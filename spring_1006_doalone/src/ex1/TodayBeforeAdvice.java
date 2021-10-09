package ex1;

import org.aopalliance.intercept.Joinpoint;

public class TodayBeforeAdvice {
	private MyPublic myPublic;

	public void setMyPublic(MyPublic myPublic) {
		this.myPublic = myPublic;
	}
	
	public void beforeToday(Joinpoint) {
		
	}
}
