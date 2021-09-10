package ex1;
// 요청 -> Servlet (요청을 분석, 처리) -> 모델(비지니스 로직 수행) -> Servlet (응답을 분석, 처리)->응답
public class CheckDemoModel {

	public String createTag(String gender, String phone, String[] fruit) {
		// 서블릭은, 모델은 html 태그를 반환하는 모델은 안좋다.
		StringBuilder sb = new StringBuilder();
		sb.append("<ol>");
		sb.append("<li>성별:").append(gender).append("</li>");
		sb.append("<li>전화번호 :").append(phone).append("</li>");
		sb.append("<li>선호과일 :");
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
