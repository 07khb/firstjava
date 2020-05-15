package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
//		Audio audio = new Audio(); 이렇게도 가능
		RemoteControl rc= new Audio();
		rc.turnOff();
		rc.turnOn();
		
//		Television tv = new Television();
		rc = new Television();
		rc.turnOff();
		rc.turnOn();
	}
}
