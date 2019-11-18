package com.test01;

import com.qClass.Score;

public class MTest {

	public static void main(String[] args) {
		Score sc = new Score();
		
		sc.setName("홍길동");
		sc.setKor(100);
		sc.setEng(50);
		sc.setMath(76);
		
		System.out.println(sc);
		
		Score lee = new Score("이순신", 99, 87, 50);
		
		System.out.println(lee);
	}
}
