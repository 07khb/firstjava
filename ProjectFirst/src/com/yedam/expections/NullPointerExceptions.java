package com.yedam.expections;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "Hello";
		
		System.out.println(str.toString());
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
			
			System.out.println("프로그램 종료.");
		} 
		
		catch(NullPointerException e) {
			System.out.println("실행중 오류가 발생");
		} catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		}
		System.out.println("프로그램 종료.");
		}
	}

