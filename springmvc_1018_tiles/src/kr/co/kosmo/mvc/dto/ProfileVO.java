package kr.co.kosmo.mvc.dto;

import java.util.List;

public class ProfileVO {
	private String name;
	private int age;
	private String email;
	private String gender;
	private String cartype;
	private List<String> cls;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String car) {
		this.cartype = car;
	}
	public List<String> getCls() {
		return cls;
	}
	public void setCls(List<String> cls) {
		this.cls = cls;
	}
	
	
	
	
}
