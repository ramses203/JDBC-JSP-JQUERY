package mytest;

public class C { 
	private B b;

	public C() {
		System.out.println("C !!!!!!");
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	public void execute() {
		b.test("¾¾");
	}
}
