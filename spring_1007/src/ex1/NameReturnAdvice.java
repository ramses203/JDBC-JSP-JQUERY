package ex1;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	public void myReturnMethod(JoinPoint jp,Object ret) {
		// JoinPoint는 Advice가 적용된 메서드 
		String namev = jp.getSignature().getName();
		System.out.println("Name :"+namev);
		System.out.println("반환값 :");
		System.out.println(ret);
	}
}
