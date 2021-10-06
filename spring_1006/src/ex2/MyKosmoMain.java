package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyKosmoMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/myKosmo.xml");
		MyKosmoInter mki = ctx.getBean("kosmo",MyKosmoInter.class);
		mki.useKosemo();//업캐스팅의 특징
	}
}
