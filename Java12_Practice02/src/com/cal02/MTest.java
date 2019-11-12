package com.cal02;

import java.util.Scanner;

public class MTest {

	/*
	 * java.util.Calendar 클래스를 사용하여 달력을 출력하자.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();

		CalendarUseApi cal = new CalendarUseApi();
		cal.prn(year, month);
	}
}
