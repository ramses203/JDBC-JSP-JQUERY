package ex5;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5/set.xml");
		CollectionBean ref = ctx.getBean("collectionBean", CollectionBean.class);
		Set<String> res = ref.getAddressList();
		for(String e : res) {
			System.out.println(e.toString());
		}
		
	}
}
