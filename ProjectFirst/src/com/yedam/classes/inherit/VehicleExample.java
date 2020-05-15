package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(); //인스턴스 생성
		vehicle.run();
		//vehicle와 연결
		vehicle = new Bus(); //Bus(자식클래스)인스턴스 생성, 부모클래스 (vehicle)변수=(자동변환)자식클래스 인스턴스 
		vehicle.run();
		//bus와 연결
		vehicle = new Taxi();
		vehicle.run();
		//taxi와 연결, 선행 연결되었던 작업들은 끊어져있음
		
		//자식클래스 = (강제형변환-자식타입) 부모클래스;
		Taxi taxi = (Taxi) vehicle; //부모클래스는 자동형변이 되지않음, 직접 형변환 해줘야 함
		taxi.run();
	}
}
