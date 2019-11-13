package com.test01;

public class Cat extends Animal {

	// 추상클래스 Animal 을 상속받은 cat 은 추상클래스의 추상 메서드를 반드시 구현해야한다.
	@Override
	public void bark() {
		System.out.println("야옹~!");
	}

	public void eat(String feed) {
		if (feed.equals("츄르츄르")) {
			System.out.println("고양이가 " + feed + " 를 격하게 먹는다.");
		} else {
			System.out.println("고양이가 " + feed + " 먹는다.");
		}
	}
}
