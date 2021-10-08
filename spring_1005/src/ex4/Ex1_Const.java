package ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Const {
	private int num;
	private String msg;
	private String code;
	
	public Ex1_Const(int num) {
		this.num = num;
		System.out.println("int 형 호출");
	}
	public Ex1_Const(String msg) {
		this.msg = msg;
		System.out.println("String 형 호출");
	}
	public Ex1_Const(int num, String code) {
		this.num = num;
		this.code = code;
		System.out.println("다중변수형 형 호출");
	}
	public String printConstRes() {
		StringBuffer sb = new StringBuffer();
		sb.append("num :").append(num);
		sb.append("msg :").append(num);
		sb.append("code :").append(num);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex4/ex4_const.xml");
		ctx.getBean("ex1",Ex1_Const.class);
		
	}
	
	
}
