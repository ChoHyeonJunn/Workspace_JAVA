package com.test01;

import java.util.Arrays;

public class MTest02 {

	public static void main(String[] args) {
		// 방법 1
		int[][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;

		// 방법 2
		int[][] b = new int[3][];
		b[0] = new int[5];
		b[1] = new int[7];
		b[2] = new int[2];

		// 방법 3
		int[][] c = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9 }, { 10, 11 } };

		// 방법 4
		int[][] d = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, 11, 12, 13 }, { 14, 15, 16 } };

		// Arrays 객체 진짜 개 현타;;
		int[][][] e = { { { 1, 2 }, { 3, 4, 5 } }, { { 6, 7 }, { 8, 9, 10 }, { 11, 12, 13 } },
				{ { 14 }, { 15 }, { 16 } } };
		System.out.println(Arrays.deepToString(e));

		System.out.println(d);

		prn(d);

		String[][] s = { { "have", "a", "nice", "day" }, { "너무", "어려워" }, { "배열", "이차원 배열" } };
		test(s);
	}

	private static void test(String[][] s) {
		/*
		 * nice -> good
		 * 어려워 -> 쉬워
		 * 이차원 배열 -> 다차원 배열
		 * 로 바꿔서 전체 출력
		 */
		
		s[0][2] = "good";
		s[1][1] = "쉬워";
		s[2][1] = "다차원 배열";
		
		System.out.println(Arrays.deepToString(s));
		
		
	}

	private static void prn(int[][] d) {
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}

		// == 와우,,,, 지가 알아서 해버려ㅏ,,,,,,

		System.out.println(Arrays.deepToString(d));
	}

}
