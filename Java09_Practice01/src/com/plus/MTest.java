package com.plus;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		// 두자리 이상 숫자를 입력하면 각 자리수를 모두 더해서 리턴받아 출력하자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 자리수를 모두 더한 합을 출력합니다.");
		System.out.println("숫자 입력 아모코나 : ");
		int num = sc.nextInt();
		System.out.println(plus(num));
	}

	private static int plus(int x) {
		int sum = 0;
		int n = 1;

		int count = (int) (Math.log10(x) + 1);

		while (count-- > 0) {
			sum += (x % (n * 10)) / n;
			x -= x % (n * 10);

			n *= 10;
		}

		return sum;
	}
}
