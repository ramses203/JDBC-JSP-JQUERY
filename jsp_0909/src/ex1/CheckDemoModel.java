package ex1;
// ��û -> Servlet (��û�� �м�, ó��) -> ��(�����Ͻ� ���� ����) -> Servlet (������ �м�, ó��)->����
public class CheckDemoModel {

	public String createTag(String gender, String phone, String[] fruit) {
		// ������, ���� html �±׸� ��ȯ�ϴ� ���� ������.
		StringBuilder sb = new StringBuilder();
		sb.append("<ol>");
		sb.append("<li>����:").append(gender).append("</li>");
		sb.append("<li>��ȭ��ȣ :").append(phone).append("</li>");
		sb.append("<li>��ȣ���� :");
		for(String e: fruit) {
	         sb.append("<a href='checkServletDetail?imgnum=").append(e).append("'>");
	         sb.append("<img src='resources/img/").append(e).append(".PNG' style='width:120px; height:120px; margin-left:2px;'>");
	         sb.append("</a>");
		}
		sb.append("</li>");
		sb.append("</ol>");
		System.out.println(sb);
		return sb.toString();
	}

	public String createImg(int ingNum) {
		StringBuilder sb = new StringBuilder();
		sb.append("<img src='resources/img/").append(ingNum).append(".PNG'>");
		return sb.toString();
	}
}
