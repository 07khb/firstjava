package com.yedam.classes.arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		//얕은 복사후 비교
		System.out.println("[얕은 복사후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length); //값을 저장하는게 아니라 저장되어있는 주소를 복사.
		System.out.println("배열 번지 비교: " + original.equals(cloned1));//이름이 다르니 당연히 다름.
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));//주소가 같은지
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));//안에 내용이 같은지
		
		//같은 복사후 비교
		System.out.println("\n[깊은 복제후 비교]"); // \n 은 엔터와 같은 역할 위에 글과 한칸 띄우기
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);//새로운 주소에 값을 저장(?)
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}
}
