package com.yedam.expections;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = null;
		try {
		System.out.println(str.toString()); //runtime
		}catch(Exception e) {
			System.out.println("null 값 참조.");
		}
		
		
		try {
			Class.forName("java.lang.String"); //일반예외
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료.");
	}
}

