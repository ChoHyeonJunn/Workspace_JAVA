package com.plus;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// 두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(plus(num));
	}

	private static int plus(int x) {
		int sum = 0;
		int temp = x;
		int n = 10;

		int count = (int) (Math.log10(x) + 1);

		while (count-- > 0) {
			sum += temp % n;
			temp -= temp % n;

			n *= 10;
		}

		return sum;
	}
}
