package lol.mvc.dto;

public class RecommendVO {
	private String userLine;
	private String puid;
	private String pcname;
	private int score;
	private String myId;
	private String myLine;
	private int winrate;
	private int picktotal;
	private double kdratio;
	
	public int getPicktotal() {
		return picktotal;
	}
	public void setPicktotal(int picktotal) {
		this.picktotal = picktotal;
	}
	public double getKdratio() {
		return kdratio;
	}
	public void setKdratio(double kdratio) {
		this.kdratio = kdratio;
	}
	public int getWinrate() {
		return winrate;
	}
	public void setWinrate(int winrate) {
		this.winrate = winrate;
	}
	public String getUserLine() {
		return userLine;
	}
	public void setUserLine(String userLine) {
		this.userLine = userLine;
	}
	
	public String getPuid() {
		return puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}
	public String getPcname() {
		return pcname;
	}
	public void setPcname(String pcname) {
		this.pcname = pcname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMyId() {
		return myId;
	}
	public void setMyId(String myId) {
		this.myId = myId;
	}
	public String getMyLine() {
		return myLine;
	}
	public void setMyLine(String myLine) {
		this.myLine = myLine;
	}
	
	

}
