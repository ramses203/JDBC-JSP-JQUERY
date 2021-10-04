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
		//spring contaner�������� xml���ϸ�
		// beans�ȿ� ��� bean�� �̱��� �������͸��� ��ϵǸ鼭 �����ȴ�
		ApplicationContext ctx = new GenericXmlApplicationContext("mytest/abc.xml");
		// ����� ��ü�ڷ��� ������ = ctx.getBean("id",����Ұ�ü�ڷ���.class);
		A ref = ctx.getBean("a",A.class);
		ref.execute();
		// ACUser ���� cȣ���ϸ�
		
	}
}
