package com.test03;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		// 객체 배열 = 객체가 들어간 배열
		
		Person lee = new Person("이순신", 33);
		Person hong = new Person("홍길동", 19);
		Person cho = new Person("조두순", 40);

		Person[] qClass = new Person[27];

		for (int i = 0; i < qClass.length; i++) {
			qClass[i] = new Person("이동현", 100);
		}

		//?
		System.out.println(Arrays.deepToString(qClass));

		for (int i = 0; i < qClass.length; i++) {
			System.out.println(qClass[i].getName() + " " + qClass[i].getAge());
		}
	}
}
