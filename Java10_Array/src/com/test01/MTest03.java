package com.test01;

public class MTest03 {

	/*
	 * 1. a~z의 값을 일차원 배열에 저장하고 다음과 같이 출력하자
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 */

	/*
	 * 2. 위에서 만든 배열을 거꾸로 출력하자.
	 * 
	 * z y x w v u t s r q p o ...
	 */

	/*
	 * 3. 1번에서 만든 배열을 대문자로 바꿔서 출력하자.
	 */
	public static void main(String[] args) {

		String arr = "";
		for (char i = 'a'; i <= 'z'; i++) {
			arr += i;
		}

		prn01(arr);
		System.out.println("\n================================");
		prn02(arr);
		System.out.println("\n================================");
		prn03(arr);

	}

	private static void prn03(String arr) {
		// Character.toUpperCase(arr[index]) 사용해도 가능!!!
		arr = arr.toUpperCase();
		char[] arrCh = arr.toCharArray();

		for (int i = 1; i <= arrCh.length; i++) {

			System.out.print(arrCh[i - 1]);
			if (i % 6 == 0)
				System.out.println();
		}
	}

	private static void prn02(String arr) {
		// TODO Auto-generated method stub
		char[] arrCh = arr.toCharArray();

		int count = 0;
		for (int i = arrCh.length - 1; i >= 0; i--) {

			System.out.print(arrCh[i]);
			count++;
			if (count % 6 == 0)
				System.out.println();
		}
	}

	private static void prn01(String arr) {
		// TODO Auto-generated method stub
		char[] arrCh = arr.toCharArray();

		int count = 0;
		for (int i = 0; i < arrCh.length; i++) {

			System.out.print(arrCh[i]);
			count++;
			if (count % 6 == 0)
				System.out.println();
		}
	}
}
