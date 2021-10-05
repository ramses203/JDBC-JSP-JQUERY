package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalToday {

	private String loc;
	private String name;
	
	public LocalToday() {// 현재 객체를 초기화 한다. 
		System.out.println("LocalToday 생성자 호출!");
	}
	public void setLoc(String loc) {//객체의 주소를 가져온다.
		this.loc = loc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String printLocaltoday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "이름 :"+name+"지역 :"+loc+":"+af.format(new Date());
		System.out.println(name);
		System.out.println(msg);
		return msg;
	}
	
}
