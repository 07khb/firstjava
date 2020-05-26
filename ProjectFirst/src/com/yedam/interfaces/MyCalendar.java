package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Calendar 설정시 => Calendar.getInstance(); // new Calandar X // 오늘 날짜
												// 현재시간 기준
		System.out.println(cal);
		cal.set(2020, 7, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("--------------------");
//		int dayOfWeek = getDayOfWeek(2020,4);
//		System.out.println(dayOfWeek);
		showCal(2020, 12);
	}

	public static void showCal(int year, int month) { // year, month 달력 출력
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		System.out.println("      [" + year + "년" + month + "월]");
		String[] week = { "son", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println();
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%3s", "");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%3d", today);
			if ((today + dayOfWeek - 1) % 7 == 0)
				System.out.println();
			today++;

		}
	}

	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//		if (month == 5) {
//			dayOfWeek = 6; // 금요일 일1 월2 화3 수4 목5 금6 토7
//		} else if (month == 6) {
//			dayOfWeek = 2; // 월요일
//		}
		return dayOfWeek;
	}

// 1 3 5 7 8 10 12
// 2
// 4 6 9 11
	public static int getLastDay(int year, int month) {
		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0)) {
				lastDay = 29;
			} else
				lastDay = 28;
		} else
			lastDay = 30;
		return lastDay;
	}

}// end class
