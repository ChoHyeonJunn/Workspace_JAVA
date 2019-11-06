package com.test01;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		//test01();
		test02();
	}
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		
		System.out.println("또 입력해 주세요 : ");
		int b = sc.nextInt();
		
		System.out.println(a + b);
	}
	
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		
		//next() : 공백을 구분해 하나만 출력 input : a b c  -> output : a
		String str = sc.next();
		System.out.println(str);
		
		//sc.next()에서 입력받은 나머지를 한번 처리해 주고 다시 nextLine()을 사용해야함
		sc.nextLine();	
		
		String str2 = sc.nextLine();
		System.out.println(str2);
	}
}
