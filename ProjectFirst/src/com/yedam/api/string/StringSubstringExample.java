package com.yedam.api.string;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);  //위 숫자 0번째부터 6번째까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //7번째 글자부터 나타냄
		System.out.println(secondNum);
	}
}
