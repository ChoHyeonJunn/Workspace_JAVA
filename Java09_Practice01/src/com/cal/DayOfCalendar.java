package com.cal;

import java.util.Scanner;

public class DayOfCalendar {

	/*
	 * 연 월 일 입력하면 -> ?년 ?월 ?일은 ?요일 입니다. 출력
	 * 
	 * 윤년 계산 일수 계산 (year, month) : int 요일 : 1년 1월 1일 ~ year.month.day
	 */
	private static int[] arrayMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static char[] DayOfWeek = new char[] { '일', '월', '화', '수', '목', '금', '토' };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연 월 일 을 입력하세요!");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();

		System.out
				.println(year + "년 " + month + "월 " + date + "일은 " + getDay(getAllDate(year, month, date)) + "요일 입니다.");
		System.out.println(
				year + "년 " + month + "월 " + date + "일은 " + DayOfWeek[getAllDate(year, month, date) % 7] + "요일 입니다.");
	}

	public static String getDay(int allDate) {

		switch (allDate % 7) {
		case 0:
			return "일";
		case 1:
			return "월";
		case 2:
			return "화";
		case 3:
			return "수";
		case 4:
			return "목";
		case 5:
			return "금";
		case 6:
			return "토";
		}
		
		return "";
	}

	public static int getAllDate(int year, int month, int date) {
		int sumDate = 0;

		// 만약 year가 2000년 이면 1999년 까지 일 수 구하기
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i)) {
				sumDate += 366;
			} else {
				sumDate += 365;
			}
		}

		System.out.println(sumDate);

		// 해당 year 의 month 가 8월 이라면 7월까지의 일수 구하기
		for (int i = 1; i < month; i++) {
			if (i == 2 && isLeapYear(year))
				sumDate += 29;
			else
				sumDate += arrayMonth[i - 1];
		}

		// 해당 year의 month 의 일 까지 더하기
		for (int i = 1; i <= date; i++) {
			sumDate++;
		}
		return sumDate;
	}

	public static boolean isLeapYear(int year) {
		// 윤년이면 true
		// 윤년아니면 false

		// 윤년조건
//		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//		}

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
