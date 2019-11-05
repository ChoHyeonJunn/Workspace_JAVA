package com.test01;

public class MTest02 {
	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 역순으로 출력하자.
		prn01();
		System.out.println("============================");
		//2. 1~100까지의 숫자 중, 2의 배수만 출력하자.
		prn02();
		System.out.println("============================");
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력하자.
		prn03();
	}
	
	public static void prn01() {
		int i = 100;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void prn02() {
		int i = 2;
		while(i<=100) {
			System.out.println(i);
			i += 2;
		}
	}
	
	public static void prn03() {
		int sum = 0;
		int num = 0;
		int i = 7;
		while(i <= 100) {
			sum += i;
			num++;
			
			i += 7;
		}
		System.out.println("7의 배수의 갯수는 " + num + " 이고, 총 합은 " + sum + " 입니다.");
	}
}
