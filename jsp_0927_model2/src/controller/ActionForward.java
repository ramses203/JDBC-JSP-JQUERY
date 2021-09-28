package controller;
// model이 수행후 나오는 결과값에 대해 어디로 갈것인가(view), 어떤방법으로 갈것인가(forward,redirect)에 대한 정보를 담아놓은 클래스이다. 실질적으로 어떤방법으로갈것인가에 해당하는(forward, redirect)에 대한 부분은 model이 결정한다.
public class ActionForward {
	
	private String nextPath;//뷰의정보
	private boolean redirect;//이동방식 forward, redirect중 하나 선택 forward는 request가 유지된다는 특징이있다. request가 하는 역할은 서블릭의 4가지스코프 중에 어떤개념에 해당하는가?
	
	public ActionForward() {
	}
	public ActionForward(String nextPath, boolean redirect) {
															 
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
