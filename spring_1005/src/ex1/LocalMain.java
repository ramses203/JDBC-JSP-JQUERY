package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LocalMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/today.xml");//beans에 있는 bean들을 싱글톤레지스트리에다가 생성을 하고 미리 생성을 해둔다.	
	LocalToday today = ctx.getBean("today", LocalToday.class);// bean에 생성해둔 애의 아이디를 참조해서 그 클래스를 가져온다.
	System.out.println(today.printLocaltoday());
	
	LazyBean lazyBean1 = ctx.getBean("lazy", LazyBean.class);
	LazyBean lazyBean2 = ctx.getBean("lazy", LazyBean.class);
	// 주소값이 왜 true일까 : 스프링은 모든 빈을 스프링 컨테이너에 관리할때 싱글톤 레지스터리에 등록해 놓는다.
	System.out.println("주소값 비교 :"+(lazyBean1==lazyBean2));
	
}
}
