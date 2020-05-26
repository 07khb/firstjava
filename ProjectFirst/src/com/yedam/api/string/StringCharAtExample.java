package com.yedam.api.string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); //위 숫자 8번째 자리(010624-1) 0부터 세기때문에 8-1해줘야 함.
		
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		}
	}
}
