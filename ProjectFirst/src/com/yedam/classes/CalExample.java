package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.sum(10, 50);
		double result2 = cal.sum(10.5, 50.3);
		//println 메소드의 매개변수를 다르게 호출 / 실행하도록
		//메소드 오버로딩.
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사각형의 넓이 " + area1);
		
		double area2 = cal.getAreaRectangle(5.5);//정사각형인 경우 한번만 써도 됨
		cal.println("정사각형의 넓이 " + area2);
		
		cal.getAreaRectangle(area1, area2);
		
	}

}//end class
