package com.yedam.dev;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine(); // 1 + 엔터-> 엔터를 넘겨줘야함

			if (selectNo == 1) {
				System.out.print("학생수를 입력하세요.");
				studentNum = scn.nextInt(); // next?? 공백이전까지의 문자열을 받는다
				scores = new int[studentNum];
				System.out.println("배열이 생성되었습니다.");
			} else if (selectNo == 2) {
				int i = 0;
				for (int score : scores) {
					System.out.println("점수를 입력하세요.");
					score = scn.nextInt();
					scores[i++] = score;
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int big = Integer.MIN_VALUE;
				for (int score : scores) {
					sum += score;
				}
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] >= big)
						big = scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + avg);
				System.out.println("최고값은 : " + big);

			} else if (selectNo == 5) {
				run = false;
			} // end of if
			System.out.println("프로그램 종료.");
		} // end of while
	} // end of main()
} // end of class
