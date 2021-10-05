package ex3;

public class LifeBean implements LifeInter{
	private String name;
	public LifeBean(String name) {
		this.name = name;
		System.out.println("생성자 호출");
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setter 호출");
	}
	public void init() {
		System.out.println("init 호출");
	}

	@Override
	public void destory() {
		System.out.println("destory 호출");
	}

	@Override
	public void method1() {
		System.out.println("name:"+name);
	}

}
