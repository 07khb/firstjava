package com.yedam.classes.inherit;

public class Friend {
	public String name;
	public String telNumber;
	public Friend(String name, String telNumber) {
		this.name = name;
		this.telNumber = telNumber;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public void showinfo() {
		System.out.println("이름 : " + name + "전화번호 : " + telNumber);
	}
	
	
	
}



