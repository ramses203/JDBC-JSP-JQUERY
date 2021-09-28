package controller;

public class ActionForward {
	private String nextPath;
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
