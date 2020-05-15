package com.yedam.classes.inherit;

public class University extends Friend {
	String major;

	public University(String name, String telNumber, String major) {
		super(name, telNumber);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showinfo() {
		System.out.println("이름 : " + name + "전화번호 : " + telNumber + "전공 : " + major);
	}


}

