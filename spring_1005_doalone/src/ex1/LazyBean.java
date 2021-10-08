package ex1;

public class LazyBean {
	private String msg;

	public LazyBean() {
		System.out.println("LazyBean 생성자 호출");
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String printMsg() {
		return msg;
	}
	
	
	//public static void main(String[] args) {
	//	LazyBean lazy = new LazyBean();
	//	lazy.setMsg("안녕하세요");
	//	System.out.println(lazy.printMsg());
	//}
}
