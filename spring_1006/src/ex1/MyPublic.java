package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPublic {

	public MyPublic() {
		System.out.println("MyPublic 생성");
	}
	
	public String todayMethod() {
		//SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		//return f.format(new Date());
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	public void other() {
		System.out.println("other 메서드 호출");
	}
}
