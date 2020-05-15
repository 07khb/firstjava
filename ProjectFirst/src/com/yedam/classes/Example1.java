package com.yedam.classes;

public class Example1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int e = 1; e <= 9; e++) {
			for (int i = 2; i <= 9; i++) {
				sum = e * i;
				System.out.print(i + " X " + e + " = " + sum + "\t");
			}
			System.out.println();
		}
	}
}
