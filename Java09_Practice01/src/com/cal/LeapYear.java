package com.cal;

import java.util.Scanner;

public class LeapYear {

	/*
	 * 윤년 법칙 ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고, ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로
	 * 하며, ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("연을 입력해 주세요 : ");
		int year = sc.nextInt();

		if (isLeapYear(year)) {
			System.out.println(year + "년 은 윤년 입니다.");
		} else {
			System.out.println(year + "년 은 평년 입니다.");
		}
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
