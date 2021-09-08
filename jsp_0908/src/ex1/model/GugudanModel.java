package ex1.model;

public class GugudanModel {

	public String ggDan(int dan) {
	StringBuilder sb = new StringBuilder();
	sb.append("<table style='width:200px;'>");
	for(int i=2; i<=dan; i++) {
		for(int j=1; j<i; j++) {
			sb.append("<tr><td>").append(i+"x"+j+"="+(i*j)).append("</td></tr>");
		}
	}
	return sb.toString();
	}
	
	
	
	
}
