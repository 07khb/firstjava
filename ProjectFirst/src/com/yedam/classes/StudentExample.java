package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student(); //인스턴스(객체) 만들기, new사용 = Student타입의 인스턴스 만들기
		//필드
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		//메소드
		stu.study();
		stu.eat("banana");
		
		System.out.println("이름은: " + stu.name + ", 나이는: " + stu.age);
		
		Student stu1 = new Student("Park");
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		System.out.println("이름은: " + stu1.name + ", 나이는: " + stu1.age);
		stu1.eat("사과");
		
		
		Student stu2 = new Student("Choi", 40);
		stu2.height = 168.4;
		stu2.weight = 60.5;
		System.out.println("이름은: " + stu2.name + ", 나이는: " + stu2.age);
		stu2.eat("수박");
		
		Student[] s1 = new Student[3];
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;
		
		String inputStr = "Choi";
		
		for(Student stud : s1) {
			if(inputStr.equals(stud.name)) {    //A.equals(B) -> A와 B가 같은가
				System.out.println(stud.name + "/ " + stud.age);
			} 
			//System.out.println(stud.name + "/ " + stud.age);
		}
		
	} //end main
} //end class
