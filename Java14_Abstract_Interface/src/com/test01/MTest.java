package com.test01;

public class MTest {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.bark();
		dog.bark();
		cat.eat("츄르츄르");
		dog.eat("생닭");
		
		// 추상클래스는 객체 생성 불가!!!!!******
		// Animal some = new Animal();
		
		/*
		 * 반드시 무언가를 구현해야만 할 때 주로 추상 클래스를 사용
		 */
	}
}
