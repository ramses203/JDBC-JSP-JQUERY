package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalToday {
	public String loc;
	public String name;
	
	public LocalToday() {
		System.out.println("LocalToday의 기본 생성자 호출");
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String printLocalToday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "이름:"+name+"지역:"+loc+af.format(new Date());
		System.out.println(name);
		System.out.println(loc);
		return msg;
	}
	
	
}
