package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		BBB b1 = new BBB(); // 기본 생성자 호출
		
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getAbc() + " + " + b1.getB() + " = " + b1.getSum());
		
		BBB b2 = new BBB(3);
		System.out.println(b2.getAbc() + " + " + b2.getB() + " = " + b2.getSum());
		
		BBB b3 = new BBB(3, 2);
		System.out.println(b3.getAbc() + " + " + b3.getB() + " = " + b3.getSum());
		
		System.out.println("==============================");
		
		AAA a1 = new AAA();
		AAA a2 = new BBB();	//부모타입으로 자식 객체 생성 가능
		//BBB b4 = (BBB) new AAA();
		a1.prn();
		a2.prn();
		//b4.getSum();
		
	}
}
