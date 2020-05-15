package com.yedam.classes.inherit;

public class Company extends Friend{
	String department;

	public Company(String name, String telNumber, String department) {
		super(name, telNumber);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void showinfo() {
		System.out.println("이름 : " + name + "전화번호 : " + telNumber + "부서 : " + department);
	}

	
}

