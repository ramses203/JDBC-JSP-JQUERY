package exam;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMapUse {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("exam/listMap.xml");
		ListMap listMap = factory.getBean("listMap",ListMap.class);
		
		List<Map<String, String>> mapList = listMap.getListmap();
		for(Map<String, String> e : mapList) {
			System.out.println(e.get("email")); 
			System.out.println(e.get("name")); 
			System.out.println(e.get("addr")); 
		}
		
		
		
	}
}
