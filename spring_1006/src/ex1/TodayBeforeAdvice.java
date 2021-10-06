package ex1;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TodayBeforeAdvice {
	private MyPublic myPublic;
	public void setMyPublic(MyPublic myPublic) {
		this.myPublic = myPublic;
	}
	
	
	
	public TodayBeforeAdvice() {
		System.out.println("TodayBeforeAdvice ����");
	}



	// Ư���� ��Ű���� �����ۺ��̶�¾� ���� �����ϴ°Ÿ� ���鲨��.
	public void beforeToday(JoinPoint jp) {
		System.out.println("Ÿ���� ����:"+jp.getTarget());
		System.out.println("Ÿ���� �̸�:"+jp.getSignature().getName());
		System.out.println(myPublic.todayMethod());
	}
	
	public void beforeToday() {
		
		System.out.println(myPublic.todayMethod());
	}
	
	public static void main(String[] args) {
		//ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1_aop.xml");
		//TodayBeforeAdvice ref = ctx.getBean("beforeAdvice", TodayBeforeAdvice.class);
		MyPublic tb = new MyPublic();
		System.out.println(tb.todayMethod());
		
		TodayBeforeAdvice ref = new TodayBeforeAdvice();
		ref.setMyPublic(new MyPublic());
		ref.beforeToday();
	}
	
}


