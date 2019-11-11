package com.cal01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// java.util.calendar 클래스를 사용하지 않고
		// 달력 출력
		

		Scanner sc = new Scanner(System.in);

		System.out.println("연 월 을 입력하세요!");
		int year = sc.nextInt();
		int month = sc.nextInt();

		int lastDayOfMonth;
		if (month == 2 && DayOfCalendar.isLeapYear(year))
			lastDayOfMonth = 29;
		else
			lastDayOfMonth = DayOfCalendar.arrayMonth[month - 1];

		int DayOfWeek = DayOfCalendar.getFirstDate(year, month) % 7 + 1;

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
}
