package kr.co.kosmo.mvc.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class UploadDemoVo {

	private int no;
	private String id;
	private String uname;
	private String orifile;
	private int age;
	private String mdate;
	private MultipartFile mfile;

	// upform2 멀티 파일 업로드 예제
	private List<MultipartFile> mfile2;

	public List<MultipartFile> getMfile2() {
		return mfile2;
	}

	public void setMfile2(List<MultipartFile> mfile2) {
		this.mfile2 = mfile2;
	}

	public MultipartFile getMfile() {
		return mfile;
	}

	public void setMfile(MultipartFile mfile) {
		this.mfile = mfile;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getOrifile() {
		return orifile;
	}

	public void setOrifile(String orifile) {
		this.orifile = orifile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
}
