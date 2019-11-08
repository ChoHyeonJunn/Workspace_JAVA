package com.test02;

import java.util.Arrays;

public class ShallowCopy {

	/*
	 * 얕은 값 복사
	 * 
	 * 메모리상의 같은 부분을 두 변수가 참조
	 */
	public static void main(String[] args) {
		int[] original = { 10, 20, 30, 40, 50 };
		int[] copy = original;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(original == copy);	//참조하는 메모리가 같아 true
		
		copy[0] = 100;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		
		System.out.println("=========================================");
		
		//hashcode : 객체의 주소값
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());
		
		
		
	}
}
