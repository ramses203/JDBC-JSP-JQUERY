package ex1.model;

public class Ex2ForModel {

	public String mymakeTableTag(int num) {
		StringBuilder sb = new StringBuilder();
		sb.append("<table style='width:100px;'>");
		for(int i=0; i<num; i++) {
		sb.append("<tr><td>").append(i+1).append("</td></tr>");
		}
		sb.append("</table>");
		return sb.toString();
		}
	public String mymakeTableTag(int num, String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append("<table style='width:100px;'>");
		for(int i=0; i<num; i++) {
		sb.append("<tr><td>").append(msg).append(i+1).append("</td></tr>");
		}
		sb.append("</table>");
		return sb.toString();
		}
	
}
