package ex3;

public class LifeBean implements LifeInter{
	private String name;
	
	public LifeBean(String name) {
		this.name = name;
		System.out.println("LifeBean �⺻ ������ ȣ��");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setter ȣ��");
	}

	@Override
	public void init() {
		System.out.println("init ȣ��");
	}

	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
	}

	@Override
	public void method1() {
		System.out.println("method1 ȣ��");
		System.out.println("name:"+name);
	}

}
