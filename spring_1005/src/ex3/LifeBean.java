package ex3;

public class LifeBean implements LifeInter{
	private String name;
	public LifeBean(String name) {
		this.name = name;
		System.out.println("������ ȣ��");
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setter ȣ��");
	}
	public void init() {
		System.out.println("init ȣ��");
	}

	@Override
	public void destory() {
		System.out.println("destory ȣ��");
	}

	@Override
	public void method1() {
		System.out.println("name:"+name);
	}

}
