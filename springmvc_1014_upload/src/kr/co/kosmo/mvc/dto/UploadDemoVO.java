package kr.co.kosmo.mvc.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadDemoVO {

		private int no;
		private String id;
		private String uname;
		private MultipartFile mfile;
		private String orifile;
		private int age;
		private String mdate;
		
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
		public MultipartFile getMfile() {
			return mfile;
		}
		public void setMfile(MultipartFile mfile) {
			this.mfile = mfile;
		}
		public String getMdate() {
			return mdate;
		}
		public void setMdate(String mdate) {
			this.mdate = mdate;
		}
		
		
		
		
}
