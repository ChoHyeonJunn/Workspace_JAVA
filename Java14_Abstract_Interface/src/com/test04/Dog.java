package com.test04;

public class Dog extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

	public void eat(String feed) {
		System.out.println("멍멍이가 " + feed + " 먹는다.");
	}

	public void bite() {
		System.out.println("멍멍이가 물었다.");
	}
}
