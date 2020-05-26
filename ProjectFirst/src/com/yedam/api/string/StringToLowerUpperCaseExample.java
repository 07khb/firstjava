package com.yedam.api.string;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase(); //글자를 전부 소문자로 바꿈 //toUpperCase->대문자로 변경+
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
