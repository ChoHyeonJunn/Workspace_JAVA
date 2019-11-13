package com.score;

public class MTest {

	public static void main(String[] args) {
		Score lee = new Score();
		lee.setName("쟌쥰");
		lee.setKor(100);
		lee.setEng(23);
		lee.setMath(75);
		
		Score hong = new Score("홍길동", 58, 90, 17);
		
		//toString() 을 호출하지 않아도 출력은 toString() 메서드의 return 값 으로 나옴
		System.out.println(lee.toString());
		System.out.println(hong);
		
	}
}
