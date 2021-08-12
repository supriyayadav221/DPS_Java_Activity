package com.ltts.Day9.model;

public class Member {
	private String name;
	private String mobile;
	private String email;
	private String location;
	
	
	public Member() {
		super();
	}
	
	public Member(String name, String email,  String mobile,String location) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", mobile=" + mobile + ", email=" + email + ", location=" + location + "]";
	}

}
