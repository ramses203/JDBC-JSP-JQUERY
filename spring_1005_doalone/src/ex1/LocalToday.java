package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalToday {
	public String loc;
	public String name;
	
	public LocalToday() {
		System.out.println("LocalToday�� �⺻ ������ ȣ��");
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String printLocalToday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "�̸�:"+name+"����:"+loc+af.format(new Date());
		System.out.println(name);
		System.out.println(loc);
		return msg;
	}
	
	
}
