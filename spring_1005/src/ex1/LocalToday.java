package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalToday {

	private String loc;
	private String name;
	
	public LocalToday() {// ���� ��ü�� �ʱ�ȭ �Ѵ�. 
		System.out.println("LocalToday ������ ȣ��!");
	}
	public void setLoc(String loc) {//��ü�� �ּҸ� �����´�.
		this.loc = loc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String printLocaltoday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "�̸� :"+name+"���� :"+loc+":"+af.format(new Date());
		System.out.println(name);
		System.out.println(msg);
		return msg;
	}
	
}
