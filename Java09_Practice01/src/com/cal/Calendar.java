package com.cal;

import java.util.Scanner;

public class Calendar {

	/*
	 * 달력 만들기
	 * 
	 * 연 월 입력시 해당 연 월의 달력이 출력되도록!
	 */
	private static int[] arrayMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("연 월 을 입력하세요!");
		int year = sc.nextInt();
		int month = sc.nextInt();

		int lastDayOfMonth;
		if (month == 2 && isLeapYear(year))
			lastDayOfMonth = 29;
		else
			lastDayOfMonth = arrayMonth[month - 1];

		int DayOfWeek = getFirstDate(year, month) % 7 + 1;

		// 출력
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int i = 1; i < DayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 0; i < lastDayOfMonth; i++) {
			System.out.print(i + 1 + "\t");

			if ((i + DayOfWeek) % 7 == 0)
				System.out.println();
		}

	}

	public static String getDay(int allDate) {
		String day = "";

		switch (allDate % 7) {
		case 0:
			day = "일";
			break;
		case 1:
			day = "월";
			break;
		case 2:
			day = "화";
			break;
		case 3:
			day = "수";
			break;
		case 4:
			day = "목";
			break;
		case 5:
			day = "금";
			break;
		case 6:
			day = "토";
			break;

		}

		return day;
	}

	// 해당 year 의 해당 month 의 1일 의 총 일수
	public static int getFirstDate(int year, int month) {
		int sumDate = 0;

		// 만약 year가 2000년 이면 1999년 까지 일 수 구하기
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i)) {
				sumDate += 366;
			} else {
				sumDate += 365;
			}
		}

		// 해당 year 의 month 가 8월 이라면 7월까지의 일수 구하기
		for (int i = 1; i < month; i++) {
			if (i == 2 && isLeapYear(year))
				sumDate += 29;
			else
				sumDate += arrayMonth[i - 1];
		}

		return sumDate + 1; // 1일 이니까 +1
	}

	public static boolean isLeapYear(int year) {
		// 윤년이면 true
		// 윤년아니면 false

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
