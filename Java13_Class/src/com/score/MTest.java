package com.score;

public class MTest {

	public static void main(String[] args) {
		Score lee = new Score();
		lee.setName("조현준");
		lee.setKor(100);
		lee.setEng(23);
		lee.setMath(75);
		
		Score hong = new Score("홍길동", 58, 90, 17);
		
		System.out.println(lee.toString());
		System.out.println(hong);
		
	}
}
