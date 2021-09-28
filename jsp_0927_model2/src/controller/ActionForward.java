package controller;
// model�� ������ ������ ������� ���� ���� �����ΰ�(view), �������� �����ΰ�(forward,redirect)�� ���� ������ ��Ƴ��� Ŭ�����̴�. ���������� �������ΰ����ΰ��� �ش��ϴ�(forward, redirect)�� ���� �κ��� model�� �����Ѵ�.
public class ActionForward {
	
	private String nextPath;//��������
	private boolean redirect;//�̵���� forward, redirect�� �ϳ� ���� forward�� request�� �����ȴٴ� Ư¡���ִ�. request�� �ϴ� ������ ������ 4���������� �߿� ����信 �ش��ϴ°�?
	
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
