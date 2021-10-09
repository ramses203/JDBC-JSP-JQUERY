package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LifeMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("ex3/life.xml");
		//ApplicationContext ctx = new GenericXmlApplicationContext("ex3/life.xml");
		LifeInter ref =  ctx.getBean("life",LifeInter.class);
		ref.method1();
		ctx.close();
	}
}
