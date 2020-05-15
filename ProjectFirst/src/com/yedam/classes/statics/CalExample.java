package com.yedam.classes.statics;
	
public class CalExample {
	public static void main(String[] args) {
		Calculator.pi = 3.14; //static 를 사용하면 클래스명을 사용해서 이용 가능 , 인스턴스 안만들어도됨
		Calculator.sum(45, 55);
	}
}
