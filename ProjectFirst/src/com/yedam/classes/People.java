package com.yedam.classes;

public class People {
	// 속성(필드) 3가지
	// 기능(메소드) 2가지
	String name;
	int age;
	String city;
	
	void drink(String str) {
		System.out.println(str + "을(를) 마십니다.");
	};
	void cook(String str) {
		System.out.println(str + "을(를) 요리합니다.");
	}
	void showInfo() { //위에서 정의한 필드를 화면에 출력시킴
		System.out.println("" + name + "" + age + ""+ city);
	}
	
	public static void main(String[] args) {
		People p1 = new People();
		p1.name = "Kim";
		p1.city = "DaeGu";
		p1.age = 28;
		System.out.println("이름은: " + p1.name + ", 나이는: " + p1.age + ", 사는곳: " + p1.city);
		
		p1.drink("참이슬");
		p1.cook("술안주");
		
		
		
		People p2 = new People();
		p2.name = "김";
		p2.city = "대구";
		p2.age = 29;
		System.out.println("이름은: " + p2.name + ", 나이는: " + p2.age + ", 사는곳: " + p2.city);
		
		p2.drink("음료수");
		p2.cook("점심밥");
		
		
		
		People p3 = new People();
		p3.name = "킴";
		p3.city = "대구광역시";
		p3.age = 30;
		System.out.println("이름은: " + p3.name + ", 나이는: " + p3.age + ", 사는곳: " + p3.city);
		
		p3.drink("이슬");
		p3.cook("저녁밥");
		
		
		
		People[] a1 = new People[3];
		a1[0] = p1;
		a1[1] = p2;
		a1[2] = p3;
		
		for(People peop : a1) {
			System.out.println(peop.name + "/ " + peop.age);
	}
}
}
