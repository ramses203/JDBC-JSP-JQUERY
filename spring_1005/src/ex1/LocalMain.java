package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LocalMain {
public static void main(String[] args) {
	ApplicationContext ctx = new GenericXmlApplicationContext("ex1/today.xml");//beans�� �ִ� bean���� �̱��淹����Ʈ�����ٰ� ������ �ϰ� �̸� ������ �صд�.	
	LocalToday today = ctx.getBean("today", LocalToday.class);// bean�� �����ص� ���� ���̵� �����ؼ� �� Ŭ������ �����´�.
	System.out.println(today.printLocaltoday());
	
	LazyBean lazyBean1 = ctx.getBean("lazy", LazyBean.class);
	LazyBean lazyBean2 = ctx.getBean("lazy", LazyBean.class);
	// �ּҰ��� �� true�ϱ� : �������� ��� ���� ������ �����̳ʿ� �����Ҷ� �̱��� �������͸��� ����� ���´�.
	System.out.println("�ּҰ� �� :"+(lazyBean1==lazyBean2));
	
}
}
