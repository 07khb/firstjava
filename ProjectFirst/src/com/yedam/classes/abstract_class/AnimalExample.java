package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal(); //Animal은 추상클래스 -> 인스턴스 불가능
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		animal = cat; //상속관계에서는 자동형변환 발생
		
	}
}
