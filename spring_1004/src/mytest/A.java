package mytest;
//<bean id="a" class="A">
public class A {
	
	public A() {
		System.out.println("A객체 생성");
	}
	
	
	private B b;
	// 의존성 주입 메서드 의존성 주입메서드는 가지는 쪽에서 setter로 정의한다.(약속이다.)
	public void setB(B b) {
		this.b = b;
	}
	
	public void execute() {
		b.test("에이");
	}
}
