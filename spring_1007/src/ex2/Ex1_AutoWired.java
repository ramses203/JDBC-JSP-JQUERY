package ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_AutoWired {
	@Autowired
	@Qualifier("a")
	private String msg;


//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	
	public String getMessage() { // 호출할 메서드 
		StringBuffer sb= new StringBuffer();
		sb.append("<p style='color:pink'>");
		sb.append(msg);
		sb.append("</p>");
		return sb.toString();
	}
}
