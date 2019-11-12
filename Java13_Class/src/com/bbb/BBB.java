package com.bbb;

import com.aaa.AAA;

/*
 * AAA 를 상속받은 클래스 BBB
 */
public class BBB extends AAA {

	// field
	private int b;

	// constructor
	public BBB() {
		// super(); //부모의 생성자를 명시하지 않는 경우, 부모의 기본 생성자를 자동 호출!! public AAA()
		System.out.println("BBB() 생성");
	}

	public BBB(int b) {
		super(b); // 부모의 생성자 public AAA(int abc)
		this.b = b;
		System.out.println("BBB(int b) 생성");
	}

	public BBB(int abc, int b) {
		super(abc); // 부모의 생성자 public AAA(int abc)
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
	}

	// getter & setter
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// method

	public int getSum() {
		//super : 부모 객체
		//this : 나 객체
		int sum;
		sum = super.getAbc() + this.getB();		//super.getAbc(), getAbc(), this.getAbc() 모두 가능
		sum = this.getAbc()  + this.getB();		// O
		sum = getAbc() 		 + this.getB();		// O
		sum = super.getAbc() + getB();			// O
		sum = this.getAbc()  + getB();			// O
		sum = getAbc() 		 + getB();			// O
		return sum;
	}

	public void prn() {
		System.out.println("BBB의 메서드 prn()");
	}
}
