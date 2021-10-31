package lol.mvc.dto;

public class MyUserVO {

	private int uno;
	private String id;
	private String pwd;
	private String uname;
	private String phone;
	private String position;
	private String tier;
	private int score;
	private String addfriend;

	public int getUno() {
		return uno;
	}

	public String getAddfriend() {
		return addfriend;
	}

	public void setAddfriend(String addfriend) {
		this.addfriend = addfriend;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
