package com.yedam.dev;

public class ArrayMethodExample {

	public static void main(String[] args) {
		int result = 0;
		int[] intAry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		result = sumAry(intAry);
		System.out.println("배열 intAry 합: " + result);
		
		double result2 = 0;
		double[] dobAry = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8 };
		result2 = avgAry(dobAry);
		System.out.println("배열 avgAry 평균: " + result2);
	}

	public static double avgAry(double[] ary) {
		// avgAry 매개값으로 받은 배열의 요소들의 평균을 계산하는 메소드
		double sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum / ary.length;

	}

	public static int sumAry(int[] ary) {
		// sumAry 매개값으로 받은 배열의 요소들의 합을 계산하는 메소드
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}