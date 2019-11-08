package com.test02;

import java.util.Arrays;

public class DeepCopy {

	/*
	 * 깊은 값 복사
	 * 
	 * 메모리상에서 객체를 복사해 새로운 객체를 만듬, 참조는 각각
	 * 복사본을 변경해도 원본에 영향이 없음
	 */
	public static void main(String[] args) {

		int[] original = { 10, 20, 30, 40, 50 };

		// 방법 1. 배열 인덱스의 값을 가져와서 복사
		int[] copyOne = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copyOne[i] = original[i];
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println(original == copyOne); // 참조하는 메모리가 다르기때문에 false
		System.out.println(Arrays.equals(original, copyOne)); // true

		copyOne[0] = 100;

		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println(original == copyOne);
		System.out.println(Arrays.equals(original, copyOne));

		System.out.println("=========================================");

		// 방법 2. original 한테 요청하여 복사 clone()
		int[] copyTwo = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println(original == copyTwo);
		System.out.println(Arrays.equals(original, copyTwo));

		System.out.println("=========================================");

		// 방법 3. System을 사용하여 복사
		int[] copyThree = new int[original.length];
		// fill() 메서드는 해당 배열을 원하는 값 (4) 로 다 채워버림 초기화에 굳!!!
		Arrays.fill(copyThree, 4);
		System.out.println(Arrays.toString(copyThree));

		// System.arrayCopy(원본 배열 객체, 원본 시작위치, 복사 배열 객체, 복사 시작위치, 복사할 개수);
		System.arraycopy(original, 0, copyThree, 2, 2);
		System.out.println(Arrays.toString(copyThree));
		// 10 20 30 40 50
		// 4  4  10 20 4

		System.out.println("=========================================");
		
		//hashcode : 객체의 주소값
		System.out.println(original.hashCode());
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(copyThree.hashCode());

	}
}
