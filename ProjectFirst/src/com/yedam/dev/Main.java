package com.yedam.dev;

public class Main {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		ary[0] = new int[] { 1, 2, 3, 4, 5 };
		ary[1] = new int[] { 6, 7, 8, 9, 10 };
		ary[2] = new int[] { 11, 12, 13, 14, 15 };
		ary[3] = new int[] { 16, 17, 18, 19, 20 };
		ary[4] = new int[] { 21, 22, 23, 24, 25 };
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				int sum = ary[i][j];
				System.out.print(sum + " " + "\t");
			}
			System.out.println();

		}
		System.out.println("====================================");
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				int sum1 = ary[j][i];
				System.out.print(sum1 + " " + "\t");
			}
			System.out.println();
		}	System.out.println("====================================");
		
		
		for(int i = 1; i<=25; i++) {
			System.out.print(i + "\t");
				if(i%5==0) {
					System.out.println();
			}
		}System.out.println("====================================");
		for(int i = 1; i<=5; i++) {
			for(int j = 0; j<5; j++) {
				int sum2 = i+j*5;
				System.out.print(sum2 + "\t");
			}System.out.println();
		}
		
	}// end main
}// end class

//cholee@yedam.ac