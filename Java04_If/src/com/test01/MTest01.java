package com.test01;

public class MTest01 {

	public static void main(String[] args) {
		prn01();
		prn02(true, false);
	}
	
	public static void prn01() {	
		int i = 10;
		int j = 20;
		

		// if : 만약 ~라면	
		if(i < j) {
			System.out.println("i가 j 보다 작아요.");
		}
		
		
		//if ~ else
		if(i>j) {
			System.out.println("i가 j 보다 커요.");
		}else {
			System.out.println("i가 j 보다 안커요.");
		}
		
		
		//if ~ else if ~
		if(i > 15)
			System.out.println("i가 15보다 커요.");
		else if(i > 10)
			System.out.println("i가 10보다 커요.");
		else if(i == 10)
			System.out.println("i가 10이랑 같아요.");
		else
			System.out.println("i가 10보다 작아요.");
	}

	public static void prn02(boolean ring, boolean married) {
		//다중 if
		if (ring) {
			if(married)
				System.out.println("결혼하셧꾼요!");
			else
				System.out.println("연인이 있으시군요!");
		} else {
			if(married)
				System.out.println("반지를 잃어버리셨군요!");
			else
				System.out.println("어이구 저런,,");
		}
		
		//if ~ else if ~ else
		if(ring && married)
			System.out.println("결혼하셨군요!");
		else if(ring || married)
			System.out.println("연인이 있으시군요!");
		else
			System.out.println("솔로시군요...");
		
		//바디 블록 없이는 한줄만 적용!
		if(ring)
			System.out.println("반지 있다.");
		
		if(married)
			System.out.println("결혼했당.");
			System.out.println("부럽당ㅜ");
	}
}
