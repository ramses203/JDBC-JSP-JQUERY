package ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Biz_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("ex4/ex1_anno.xml");
		BizService dao = ctx.getBean("target",BizService.class);
		//dao.bizMethod1();
		dao.second();
		//System.out.println(res);
	}
}
