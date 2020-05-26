package com.yedam.classes.lambda;
//class MyFuncClass implements MyFunctionlInterface {

//	MyFunctionlInterface fi = new MyFunctionlInterface
//	@Override
//	public void run() {
//		System.out.println("실행.");
//	}
//};
//fi.run();

public class LambdaExample {
	public static void main(String[] args) {
		//
		MyFunctionlInterface fi = new MyFunctionlInterface() {
			// 익명구현객체
			@Override
			public void run() {
				System.out.println("실행.");
			}
		};
		fi.run();
// 간단한 람다표현식. run() 메소드 구현하는 부분
		MyFunctionlInterface fi2 = () -> {
			System.out.println("실행.");
		};
		fi2.run();

		// 2)매개값이 있는 인터페이스
		MySumInterface si = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("두수의 합: " + result);
		};
		si.sum(10, 20);
		
		//3)반환값이 있고 매개값도 있는 인터페이스.
		MyMultiInterface mi = (num1, num2) -> {
				return num1 * num2;
		};
		int result = mi.multi(10, 15);
		System.out.println("결과값은 : " + result);
	}
}
