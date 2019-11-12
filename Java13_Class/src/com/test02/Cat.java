package com.test02;

public class Cat extends Animal {

	
	public Cat() {
		System.out.println("고양이");
	}
	
	// overried : 재정의 -> 상속받은 부모클래스의 메서드를 확장/변형 할 때
	@Override
	public void bark() {
		System.out.println("야옹");
	}
}
