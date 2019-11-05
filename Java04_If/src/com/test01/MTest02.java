package com.test01;

public class MTest02 {

	public static void main(String[] args) {
		/*
		 * 1. 아규먼트가 5의 배수이면 "5의 배수입니다." 라고 출력하는 메서드를 만들자.
		 * 2. 아규먼트가 2의 배수이면서 3의 배수이면 
		 * 		"2와 3의 배수입니다." 를 출력하고, 아니면
		 *      "2와 3의 배수가 아닙니다." 를 출력하는 메서드를 만들자
		 * 3. 아규먼트가 소문자라면 "소문자 입니다." 를 출력하고,
		 *      대문자라면 "대문자 입니다." 를 출력하는 메서드를 만들자.
		 *      
		 * 4. 메서드 3개를 호출하자.
		 */
		
		multiFive(10);
		multiThreeTwo(12);
		Cappital('s');
	}
	
	public static void multiFive(int i) {
		if((i % 5) == 0)
			System.out.println("5의 배수입니다.");
		else
			System.out.println("5의 배수가 아닙니다.");
	}
	
	public static void multiThreeTwo(int i) {
		if((i % 2) == 0 && (i % 3) == 0)
			System.out.println("2와 3의 배수입니다.");
		else
			System.out.println("2와 3의 배수가 아닙니다.");
	}
	
	public static void Cappital(char str) {
		//Java.lang.Character 이용
		if(Character.isUpperCase(str))
			System.out.println("대문자 입니다.");
		else
			System.out.println("소문자 입니다.");
		
		//ascii code 표 이용
		if(65 <= (int)str && (int)str <= 90)
			System.out.println("대문자 입니다.");
		if(97 <= (int)str && (int)str <= 122)
			System.out.println("소문자 입니다.");
	}
}
