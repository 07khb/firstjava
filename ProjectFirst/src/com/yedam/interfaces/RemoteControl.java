package com.yedam.interfaces;

public interface RemoteControl { //interface
	// 상수 final static(포함)
	public int MAX_VOLUME = 0;
	public int MIN_VOLUME = 10;
	//MAX_VOLUME = 1; 상수 MAX_VOLUME이 한번 설정되면 값을 바꿀수 없음
	
	
	//추상메소드.
	public void turnOn();
	public void turnOff();
	
}
