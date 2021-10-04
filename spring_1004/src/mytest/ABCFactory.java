package mytest;

public class ABCFactory {

	private A a;
	private B b;
	private C c;
	private static ABCFactory factory;
	private ABCFactory() {
	}
	public static ABCFactory getFactory() {
		if(factory == null) factory = new ABCFactory();
		return factory;
	}
	public void makeABC() {
		
		b = new B();
		a = new A();
		c = new C();
		a.setB(b);
		c.setB(b);
	}

	
	
	public A getA() {
		return a;
	}
	public C getC() {
		return c;
	}
	public static void main(String[] args) {
		ABCFactory ref = ABCFactory.getFactory();
		ref.makeABC();
		ref.a.execute();
		System.out.println("-------------------");
		ref.c.execute();
	}
}
