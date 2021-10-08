package ex2;

public class MyTestA {
	private ResourcesB b;
	
	public void setB(ResourcesB b) {
		this.b = b;
	}
	
	public String printUseb() {
		StringBuilder sb =  new StringBuilder();
		sb.append("B에서 반환받은값:"+(b.res()*2)).append("<br>");
		sb.append("사용자 이름:").append(b.getUname());
		return sb.toString();
	}
}
