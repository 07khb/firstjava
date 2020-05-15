package com.yedam.interfaces;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 을 끕니다.");
	}

}
