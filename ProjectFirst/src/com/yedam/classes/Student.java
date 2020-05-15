package com.yedam.classes;

public class Student {
	//이름, 나이, 키, 몸무게 (속성) -> 필드
	String name;
	int age;
	double height;
	double weight;
	
	
	// 생성자 -> 필드의 초기값 지정
	public Student() {
		System.out.println("생성자 호출.");
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	
	public Student(String name, int age) {
		this.name = name; //this는 필드에 정의되어있는 필드(객체)들을 가리킬때
		this.age = age;
		//this(name, age); 이렇게도 가능
	}

	
	//공부한다, 운동한다, 먹는다 (기능, 동작) -> 메소드
	void study() { 
		System.out.println("공부합니다.");
	};
	void exercise() {
		System.out.println("운동합니다.");
	}
	void eat(String str) {
		System.out.println(str + " 을 먹는다.");
	}
}
