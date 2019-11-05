package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		prn01();
		prn02();
		prn03();
	}
	

	public static void prn03() {
		char c = 'b';
		
		switch(c) {
		case 'a':
			System.out.println("a 입니다.");
			break;
		case 'b':
			System.out.println("b 입니다.");
			break;
		case 'c':
			System.out.println("c 입니다.");
			break;
		}
	}
	
	private static void prn02() {
		
		switch(6/2) {
		case 1:
		case 3:
			System.out.println("홀수 입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수 입니다.");
			break;
		}
		
	}

	public static void prn01() {
		//switch : 해당 case 로 jumping 후 fall through
		int i = 7;
		switch(i) {
		case 1: 
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		case 4:
			System.out.println("4 입니다.");
			break;
		default :
			System.out.println("default");
			break;
		}
		
	}
	
	
	
}
