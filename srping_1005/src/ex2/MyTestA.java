package ex2;

public class MyTestA {
	private ResourcesB b;

	public void setB(ResourcesB b) {
		this.b = b;
	}
	
	public String printUseb() {
		StringBuilder sb = new StringBuilder();
		sb.append("B���� ��ȯ ���� ��:"+(b.res()*2)).append("<br>");
		sb.append("����� �̸� :").append(b.getUname());
		return sb.toString();
	}
}
