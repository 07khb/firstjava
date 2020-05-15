package com.yedam.database;

public class Emp {
	private int employee_id;
	private String lastName;
	private int salary;
	private String hireDate;
	public Emp(String lastName, String hireDate) {
		this.lastName = lastName;
		this.hireDate= hireDate;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void showInfo() {
		System.out.println("사원번호 " + employee_id + ", 성 " + lastName + ", 급여 " + salary + ", 입사일 " + hireDate);
	}
	
}
