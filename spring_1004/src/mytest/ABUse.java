package mytest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mytest.ABCFactory;

public class ABUse {

	public static void main(String[] args) {
	/*	ABCFactory ref = ABCFactory.getFactory();
		ref.makeABC();
		ref.getA().execute();
		System.out.println("-------------------");
		ref.getC().execute();*/
		//spring contaner를정의한 xml파일명
		// beans안에 모든 bean이 싱글톤 레지스터리에 등록되면서 생성된다
		ApplicationContext ctx = new GenericXmlApplicationContext("mytest/abc.xml");
		// 사용할 객체자료형 변수명 = ctx.getBean("id",사용할객체자료형.class);
		A ref = ctx.getBean("a",A.class);
		ref.execute();
		// ACUser 만들어서 c호출하면
		
	}
}
