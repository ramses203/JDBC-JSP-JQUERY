package ex3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LifeMain {
public static void main(String[] args) {
	//BeanFactory : (�ֻ��� �����������̳� �������̽�) ��� - ������ ����
	//XmlBeanFactory : xml�� ������� �� ������ �����̳� ������ü
	//1. ���� �⺻���� ������ �����̳��̴�. getBean�Ҷ� ������ �ȴ�. �������� ���
	//BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("src/ex3/life.xml"));
	// getBean�� ������ ��μ� ������ �����̳ʿ� ������ �Ѵ�. 
	//LifeInter inter = ctx.getBean("life",LifeInter.class);
	//--------------------------------------------------------------------------------
	//ApplicationContext ctx2 = new GenericXmlApplicationContext("ex3/life.xml");
	
	//jvm���� Spring Container�� �ڿ��� ���� �Ҽ� �ִ� ����� ���� �߻� Ŭ����
	AbstractApplicationContext ctx3 = new GenericXmlApplicationContext("ex3/life.xml"); 
	LifeInter inter = ctx3.getBean("life",LifeInter.class);
	inter.method1();
	ctx3.close();
}
	
}
