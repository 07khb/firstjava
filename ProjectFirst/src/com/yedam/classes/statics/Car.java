package com.yedam.classes.statics;

public class Car { //퍼블릭은 다른 패키지에서도 이 클래스를 부를수 있다
	private int speed; //초기값 0 //private접근수준을 정함 speed에 접근하려면 car(private가 적힌 클래스)클래스 내에서만 가능해짐, 외부클래스에서는 값 처리 불가능
	private boolean stop; //초기값 false //boolean 참과 거짓?
	
	void setSpeed(int speed) {
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
		
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}//end class
