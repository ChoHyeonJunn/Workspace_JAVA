package com.test01;

public class MTest {

	public static void main(String[] args) {

		AA a = new AA();
		Super s = a;
		// BB b = (BB)s; //X : 같은 클래스를 상속받은 AA BB 지만 서로 형변환은 불가능

		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
	}
}
