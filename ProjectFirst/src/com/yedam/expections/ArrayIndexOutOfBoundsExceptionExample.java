package com.yedam.expections;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i <= intAry.length; i++) {
			try {
				intAry[i] = i + 1;
				System.out.println(intAry[i]); //예외 발생전까지 실행
				int num1 = Integer.parseInt(args[0]); //문자를 숫자로 변환
			} catch (ArrayIndexOutOfBoundsException e) { //AIOOBE + 컨트럴엔터
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]"); //예외가 발생하면 실행문 실행
			} catch (NumberFormatException e1) {
				System.out.println("변환 불가."); //하나라도 예외처리가 되지않으면 오류발생
			} catch (Exception e2) { //오류의 종류를 모를시 Exception 입력, 예외문 중 최상위, 같이 사용하게되면 맨 마지막에 입력할 것.
				System.out.println("알 수 없는 오류 발생.");
			}
		}
		System.out.println("end of prog.");
	}
}
