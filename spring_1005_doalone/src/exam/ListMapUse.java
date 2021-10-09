package exam;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMapUse {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/listMap.xml");
		ListMap ref = ctx.getBean("listmap", ListMap.class);
		List<Map<String, String>> res = ref.getListmap();
		for(Map<String, String> e : res) {
			System.out.println(e.get("email"));
			System.out.println(e.get("name"));
			System.out.println(e.get("addr"));
		}
	
	}
}
