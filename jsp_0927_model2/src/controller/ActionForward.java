package controller;
// model이 수행후 반환할때 사용하는 클래스
public class ActionForward {
	
	private String nextPath;//뷰의정보
	private boolean redirect;//이동방식 forward, redirect중 하나 선택
	
	public ActionForward(String nextPath, boolean redirect) {//ActionForward 클래스의 인자값을 가지는 생성자가 
															 //1) String타입의 패스와 boolean 타입의 redirect를 인자값으로 받고
		this.nextPath = nextPath;
		this.redirect = redirect;
	}
	
	public String getNextPath() {
		return nextPath;
	}
	public void setNextPath(String nextPath) {
		this.nextPath = nextPath;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
	
}
