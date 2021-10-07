package ex4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BizAdvice {

	@Before("execution(* ex4.BizServiceIm*..bizMethod1(..))")
	public void beforeMethod() {
		System.out.println("��ó��!!!!!!!!!!!");
	}
	@AfterReturning(pointcut = "execution(* ex4.BizServiceIm*..second(..))",returning = "ret")
	public void myReturnMethod(JoinPoint jp , Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name :"+namev);
		System.out.println("��ȯ�� :"+ret);
	}
	// first()ȣ�� �� �� ������̼����� Around �� ���� �غ��ô�. (��������)
	@Around("execution(* ex4.BizServiceImple.first())")
	public void myAroundMethod(ProceedingJoinPoint pip) {
		long start = System.currentTimeMillis();
		try {
			pip.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� :"+(end-start));
	}
	
}
