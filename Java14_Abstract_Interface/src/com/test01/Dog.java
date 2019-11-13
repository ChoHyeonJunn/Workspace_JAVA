package com.test01;

public class Dog extends Animal {

	// 추상클래스 Animal 을 상속받은 cat 은 추상클래스의 추상 메서드를 반드시 구현해야한다.
	@Override
	public void bark() {
		System.out.println("멍멍~!");

	}
	
	public void eat(String feed) {
		System.out.println("멍멍이가 " + feed + " 먹는다.");
	}

}
