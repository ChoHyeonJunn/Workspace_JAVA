package com.test02;

import java.util.Scanner;

public class MTest {

	/*
	 * 동적 바인딩 : 런타임 시 메모리 할당을 하면서 메모리를 동적으로 연결하는 방식
	 * 
	 * why? 1. 메모리 절약 2. 실행속도 향상 3. 행위 은닉
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택해 주세요 [1:고양이 2:멍멍이 3:렛서팬더]");
		int select = sc.nextInt();

		// Animal 타입 변수에
		Animal some = null;

		// 동적 바인딩 : 사용자의 선택에 따라 객체가 선택됨!
		switch (select) {
		case 1:
			some = new Cat();
			break;
		case 2:
			some = new Dog();
			break;
		case 3:
			some = new Panda();
			break;

		}
		some.start();
		some.stop();

	}
}
