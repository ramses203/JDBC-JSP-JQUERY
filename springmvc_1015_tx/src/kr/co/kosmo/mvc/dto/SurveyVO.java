package kr.co.kosmo.mvc.dto;

import java.util.List;

public class SurveyVO {

	private int num;
	private String sub;
	private int code;
	private String sdate;
	private List<SurveyContentVO> scvolist;

	public List<SurveyContentVO> getScvolist() {
		return scvolist;
	}

	public void setScvolist(List<SurveyContentVO> scvolist) {
		this.scvolist = scvolist;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

}
