package ex3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LifeMain {
public static void main(String[] args) {
	//BeanFactory : (최상위 스프링컨테이너 인터페이스) 사용 - 존재의 이유
	//XmlBeanFactory : xml을 기반으로 한 스프링 컨테이너 구현객체
	//1. 가장 기본적인 스프링 컨테이너이다. getBean할때 생성이 된다. 원시적인 기능
	//BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("src/ex3/life.xml"));
	// getBean을 했을때 비로소 스프링 컨테이너에 생성을 한다. 
	//LifeInter inter = ctx.getBean("life",LifeInter.class);
	//--------------------------------------------------------------------------------
	//ApplicationContext ctx2 = new GenericXmlApplicationContext("ex3/life.xml");
	
	//jvm에서 Spring Container의 자원을 해제 할수 있는 기능을 가진 추상 클래스
	AbstractApplicationContext ctx3 = new GenericXmlApplicationContext("ex3/life.xml"); 
	LifeInter inter = ctx3.getBean("life",LifeInter.class);
	inter.method1();
	ctx3.close();
}
	
}
