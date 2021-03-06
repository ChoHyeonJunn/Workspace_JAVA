package com.plus;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// 두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.

		Scanner sc = new Scanner(System.in);

		System.out.println("각 자리수를 모두 더한 합을 출력합니다.");
		System.out.println("숫자 입력 아모코나 : ");
		int num = sc.nextInt();

		System.out.println(plusWhile(num));
		System.out.println("==========================");
		System.out.println(plusFor(num));
	}

	public static int plusFor(int i) {
		int sum = 0;
		int n = 1;

		int count = (int) (Math.log10(i) + 1);

		for (int j = 0; j < count; j++) {
			sum += (i % (n * 10)) / n;
			i -= i % (n * 10);

			n *= 10;
		}

		// 아아주 좋은 방법
//		int sum = 0;
//		
//		for (int target = i; target > 0; target /= 10)
//			sum += target % 10;

		return sum;
	}

	private static int plusWhile(int i) {
		int sum = 0;
		int n = 1;

		int count = (int) (Math.log10(i) + 1);

		while (count-- > 0) {
			sum += (i % (n * 10)) / n;
			i -= i % (n * 10);

			n *= 10;
		}

		
//		int sum = 0;
//		
//		while (i > 0) {
//			sum += i % 10;
//			i /= 10;
//		}

		return sum;
	}
}
