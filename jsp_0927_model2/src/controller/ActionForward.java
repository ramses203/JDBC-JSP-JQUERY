package controller;
// model�� ������ ��ȯ�Ҷ� ����ϴ� Ŭ����
public class ActionForward {
	
	private String nextPath;//��������
	private boolean redirect;//�̵���� forward, redirect�� �ϳ� ����
	
	public ActionForward(String nextPath, boolean redirect) {//ActionForward Ŭ������ ���ڰ��� ������ �����ڰ� 
															 //1) StringŸ���� �н��� boolean Ÿ���� redirect�� ���ڰ����� �ް�
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
