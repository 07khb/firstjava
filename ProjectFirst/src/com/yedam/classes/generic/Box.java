package com.yedam.classes.generic;

public class Box<T> { //<>속 T 대신 다른 알파벳 이용 가능 대신 아래쪽도 다 바꿔줘야 함.
	T object; //박스를 실행하는 파일형식을 정해주겠다 
	
	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
}
