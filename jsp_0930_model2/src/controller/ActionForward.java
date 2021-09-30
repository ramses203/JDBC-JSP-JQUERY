package controller;
// 사용하는 클래스 - 컨트롤서블릿 , 각 모델들이 사용
public class ActionForward {
	private String nextPath;
	/*
	 * redirect:
	 * false이면 nextPath => index.jsp
	 * true이면 nextPath => main.kosmo?com=xxx
	 */
	private boolean redirect;

	public ActionForward(String nextPath, boolean redirect) {
		this.nextPath = nextPath;
		this.redirect = redirect;
	}
	public ActionForward() {
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
