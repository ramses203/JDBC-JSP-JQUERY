package mytest;
//<bean id="a" class="A">
public class A {
	
	public A() {
		System.out.println("A��ü ����");
	}
	
	
	private B b;
	// ������ ���� �޼��� ������ ���Ը޼���� ������ �ʿ��� setter�� �����Ѵ�.(����̴�.)
	public void setB(B b) {
		this.b = b;
	}
	
	public void execute() {
		b.test("����");
	}
}
