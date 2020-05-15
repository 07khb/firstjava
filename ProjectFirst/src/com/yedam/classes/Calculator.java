package com.yedam.classes;

public class Calculator {
	String model;
	public Calculator() {  //아무것도 정의하지 않을시 이렇게 되어있음
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int sum(int num1, int num2) {
		return num1 + num2; //return이 있을시 void X
	}
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	void println(String str) {
		System.out.println("결과값은: " + str);
	}
	
	void println(int str) {
		System.out.println("결과값은: " + str);
	}
	void println(double str) {
		System.out.println("결과값은: " + str);
	}
	double getAreaRectangle(double width, double height) {
		return width * height;//직사각형
	}
	double getAreaRectangle(double width) {
		return width * width;//정사각형
	}
}//end class
