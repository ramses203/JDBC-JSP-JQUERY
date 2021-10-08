package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LocalMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/today.xml");
		LocalToday locToday = ctx.getBean("today",LocalToday.class);
		String res = locToday.printLocalToday();
		System.out.println(res);
		
		
		
		
		//LazyBean lb = ctx.getBean("lazy",LazyBean.class);
		//LazyBean lb2 = ctx.getBean("lazy",LazyBean.class);
		
		//System.out.println("주소값 비교 :"+(lb == lb2));
	}
}
