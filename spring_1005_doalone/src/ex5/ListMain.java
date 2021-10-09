package ex5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5/list.xml");
		Ex1_ListDemo ref = ctx.getBean("list", Ex1_ListDemo.class);
		List<String> res = ref.getSlist();
		for(String e : res) {
			System.out.println(e);
		}
	}
}
