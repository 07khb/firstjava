package com.yedam.interfaces;

public interface EmpService { // interface 활용방법
	// 기능정의. 구현X
	// 정의해줘야 하는 기능 : 한건 생성, 전체조회, 한건수정, 한건삭제

	// 한건 생성
	public void createEmp(Employee emp); // public abstract void createEmp(); interface가 이렇게 만들어줌
	
//	전체조회
	public void getEmpList();
	
//	한건수정
	public void changeEmp(Employee emp);
	
//	한건삭제
	public void remobeEmp(int empId);

}
