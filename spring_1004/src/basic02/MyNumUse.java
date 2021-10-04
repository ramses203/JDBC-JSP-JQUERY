package basic02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyNumUse {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("basic02/mynum.xml");
		IntNum ref1 = ctx.getBean("num1",IntNum.class);
		int res1 = ref1.makeNum(3);
		System.out.println(res1);
		System.out.println("----------------------");
		IntNum2 ref2 = ctx.getBean("num2",IntNum2.class);
		int res2 = ref2.makeNum(2);
		System.out.println(res2);
	}
}
