package ex2;

import org.aspectj.lang.JoinPoint;


public class MyBeforeAdvice {
	
	private MyLogin myLogin;
	
	public void setMyLogin(MyLogin myLogin) {
		this.myLogin = myLogin;
	}
	
	public void beforePwd(JoinPoint jp) {
		myLogin.inputpwd();
	}
}
