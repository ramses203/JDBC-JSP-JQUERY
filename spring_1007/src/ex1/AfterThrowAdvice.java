package ex1;

import org.aspectj.lang.JoinPoint;

public class AfterThrowAdvice {
	public void commThrow(JoinPoint jp,Exception ew){
		System.out.println("���� �޼��� :"+ew.getMessage());
	}
}