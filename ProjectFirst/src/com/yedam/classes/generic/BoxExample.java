package com.yedam.classes.generic;
class Apple{
	
}
class Orange {
	
}
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = (String) box.get(); //object 에서 string로 형변환
	
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		Orange orange = orangeBox.get(); //잦은 형변환은 프로그램 성능 저하
	}
}
