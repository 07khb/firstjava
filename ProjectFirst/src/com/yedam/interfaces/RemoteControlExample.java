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
		
		//익명객체
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니다.");
			}
			
		}; //;을 써줘야함 하나의 실행문이기 때문에
		rc2.turnOn();
		rc2.turnOff();
		
	}
}
