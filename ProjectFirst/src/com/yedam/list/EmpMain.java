
package com.yedam.list;

import java.util.Scanner;

public class EmpMain { // interface 활용방법
	public static void main(String[] args) {
		// 1.입력 2.전체리스트 3.수정 4.삭제 5.종료
		Scanner scr = new Scanner(System.in);
		EmpService service = new EmpSerivceImpl();
//		EmpSerivceImpl service = new EmpSerivceImpl();
		
		while (true) {
			
			try {
			System.out.println("================================");
			System.out.println("1.입력 2.전체리스트 3.수정 4.삭제 5.종료");
			System.out.println("================================");
			System.out.print("선택>");
			int menu = scr.nextInt(); scr.nextLine();
			if (menu == 1) {
				System.out.print("사원번호 입력: ");
				int empId = scr.nextInt(); scr.nextLine();
				System.out.print("성 입력: ");
				String lastName = scr.nextLine();
				System.out.print("급여 입력: ");
				int salary = scr.nextInt(); scr.nextLine();
				System.out.print("입사일 입력(2020/05/05): ");
				String hireDate = scr.nextLine();
				Employee emp = new Employee(empId, lastName, salary, hireDate);
				service.createEmp(emp);
		}else if (menu == 2) {
				service.getEmpList();
			} else if (menu == 3) {
				System.out.print("변경 사원번호 입력");
				int empId = scr.nextInt();
				System.out.print("급여 입력");
				int salary = scr.nextInt();
				Employee emp = new Employee(empId, "", salary, "");
				service.changeEmp(emp);

			} else if (menu == 4) {
				System.out.print("삭제할 사원번호 입력:");
				int empId = scr.nextInt();
				service.removeEmp(empId);

			} else if (menu == 5) {
				break;
			}
		}catch (Exception e) {
			System.out.println("입력정보에 맞게 입력하시오.");
			scr = new Scanner(System.in);
		}
			
			
		}//end of while
		System.out.println("프로그램 종료.");
	} //end main
	
	
//	public static void NumCheck() {
//		while(true) {
//			if() {
//				
//			}else {
//				
//			}
//			
//		}return=0;
//	}
} //end class
