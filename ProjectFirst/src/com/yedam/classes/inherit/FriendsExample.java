package com.yedam.classes.inherit;

import java.util.Scanner;

import com.yedam.classes.Account;

public class FriendsExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Friend[] friend = new Friend[100];
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.주소추가 2.주소목록 3.조회이름 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt(); scn.nextLine();
			
		}
	}
}
