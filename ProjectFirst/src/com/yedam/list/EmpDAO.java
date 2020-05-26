package com.yedam.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO { //interface 활용방법
	//필드
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	//메소드 5개
	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insertEmp(Employee emp) {
		String sql = "insert into emp values(?,?,?,?)"; //(?,?,?,?)매개값을받아서 처리하겠습니다.
		conn = getConnect(); //위 url정보
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId()); //1=위 첫번째 ?
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Employee> getEmpList() {
		conn = getConnect(); //DB와 연결하는 구문
		String sql = "select * from emp";
		List<Employee> employees = new ArrayList<>(); //밑에ResultSet rs를 배열에 담기위해
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"), rs.getInt("salary"), rs.getString("hire_date"));
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}
	
	public void updateEmp(Employee emp) {
		// 전제조건: 급여만 변경.
		conn = getConnect(); //DB와 연결하는 구문
		String sql = "update emp set salary = ? where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 병경됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmp(int empId) {
		conn = getConnect(); //DB와 연결하는 구문
		String sql = "delete from emp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
//그냥 외우기