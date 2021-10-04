package basic01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyMessageUse {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("basic01/mymsg.xml");
		KorMessage ref1 = ctx.getBean("kor",KorMessage.class);
		String res1 = ref1.makeMessage("³ª¶ù¸»¾¸~");
		System.out.println(res1);
		System.out.println("----------------------");
		EngMessage ref2 = ctx.getBean("eng",EngMessage.class);
		String res2 = ref2.makeMessage("Test");
		System.out.println(res2);
	}
}
