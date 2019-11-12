package com.test02;

public class MTest {

	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.bark();
//		
//		Dog dog = new Dog();
//		dog.bark();
//		

		// 부모클래스 형태의 변수에서 자식 객체 어디든 접근 가능
		Animal some = null;
		some = new Dog();
		some.bark();
		some = new Cat();
		some.bark();

		// some 이 dog 형태의 객체라면
		if (some instanceof Dog) {
			System.out.println("멍멍이다.");
		} else if (some instanceof Cat) {
			System.out.println("고양이다.");
		} else {
			System.out.println("동물이다.");
		}
	}
}
/*
 * 다형성 polymorphism
 * 
 * 1. 부모(선조) 의 타입으로 자식(후손) 객체 생성 가능
 * 
 * Parent p = new Child();
 * 
 * 
 * 2. 부모의 타입으로 자식 대입 가능
 * 
 * Child c = new Chile();
 * Parent p = c;
 * 
 * 
 * 3. 부모의 메서드를 통해 자식 메서드 호출 가능
 * 
 * 	같은 부모클래스를 가지고 있는 자식 클래스는 컴파일 시 형 변환이 가능하지만
 *  런타임 시 ClassCastException을 발생시킨다.
 */










