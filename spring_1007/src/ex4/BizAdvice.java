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
		System.out.println("전처리!!!!!!!!!!!");
	}
	@AfterReturning(pointcut = "execution(* ex4.BizServiceIm*..second(..))",returning = "ret")
	public void myReturnMethod(JoinPoint jp , Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name :"+namev);
		System.out.println("반환값 :"+ret);
	}
	// first()호출 할 때 어노테이션으로 Around 를 구현 해봅시다. (연습문제)
	@Around("execution(* ex4.BizServiceImple.first())")
	public void myAroundMethod(ProceedingJoinPoint pip) {
		long start = System.currentTimeMillis();
		try {
			pip.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 :"+(end-start));
	}
	
}
