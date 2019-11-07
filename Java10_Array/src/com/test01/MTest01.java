package com.test01;

public class MTest01 {

	// Array : 여러개의 값을 효과적으로 관리하기 위한 객체
	// 같은 타입

	public static void main(String[] args) {
		// 방법1
		int[] a; // 선언
		a = new int[5]; // 정의

		a[0] = 1; // 초기화
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(a[1]);

		// 방법2
		// 선언 = 정의 = 초기화
		int[] b = new int[] { 6, 7, 8, 9, 10 };
		System.out.println(b[1]);

		// 방법3
		int c[] = { 11, 12, 13, 14, 15, 16, 17 };
		System.out.println(c[1]);
	}
}
