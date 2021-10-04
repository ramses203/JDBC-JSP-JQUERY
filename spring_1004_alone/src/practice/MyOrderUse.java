package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyOrderUse {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("practice/myorder.xml");
		KoreaCookModel ref1 = ctx.getBean("kor", KoreaCookModel.class);
		String res1 = ref1.orderList("불고기");
		System.out.println(res1);
		System.out.println("==================================================================");
		IndoCookModel ref2 = ctx.getBean("ind", IndoCookModel.class);
		String res2 = ref2.orderList("커리");
		System.out.println(res2);
		
	}
	
}
