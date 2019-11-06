package com.test01;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		test01();
		test02();
	}

	private static void test02() {
		// 콘솔창에 입력한 숫자의 단만 출력하자.

		Scanner sc = new Scanner(System.in);

		System.out.println("구구단에서 원하는 단을 입력해 주세요 : ");
		int i = sc.nextInt();

		System.out.println("<" + i + " 단>");
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}

	}

	private static void test01() {
		Scanner sc = new Scanner(System.in);

		System.out.println("성을 입력해 주세요 : ");
		String lastName = sc.nextLine();

		System.out.println("이름을 입력해 주세요 : ");
		String firstName = sc.next();

		System.out.println("안녕하세요, " + lastName + firstName + "님. ");

		System.out.println(sc.next());

		//sc.close();	
		//test02에서 다시 scan 할 때 오류!! 
		//Scanner sc = new Scanner(System.in) 을 전역변수로 선언해서 프로그램이 모두 끝나고 close() 하는게 좋음
	}
}
