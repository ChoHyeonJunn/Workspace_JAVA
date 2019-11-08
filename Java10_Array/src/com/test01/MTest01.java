package com.test01;

import java.util.Arrays;

public class MTest01 {

	// Array : (같은 타입의)여러개의 값을 효과적으로 관리하기 위한 객체
	
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
		// 선언 초기화
		int c[] = { 11, 12, 13, 14, 15, 16, 17 };
		System.out.println(c[1]);
		System.out.println(c);
		// prn(c);

		// 와우;;;;
		System.out.println(Arrays.toString(c));

		String[] s = new String[] { "have", "a", "nice", "day" };
		test(s);
	}

	private static void test(String[] s) {
		// nice -> good 으로 바꾸고
		// [have, a, good, day] 로 출력
		// 단. Arrays 클래스를 사용하지 말 것!

		s[2] = "good";

		System.out.print("[");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			if (i < s.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

		// ==

		System.out.println(Arrays.toString(s));

	}

	private static void prn(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}
}
