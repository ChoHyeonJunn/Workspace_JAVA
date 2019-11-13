package com.test03;

public class MTest {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.bark();
		cat.eat("츄르츄르");
		
		Animal dog = new Dog();
		dog.bark();
		dog.eat("사료");
	}
}
