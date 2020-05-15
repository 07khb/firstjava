package com.yedam.interfaces;

public class Audio implements RemoteControl{//implements->RemoteControl가지고 있는 추상메소드를 반드시 구현해야한다

	@Override
	public void turnOn() {
		System.out.println("Audio 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 를 끕니다.");
	} 

}
