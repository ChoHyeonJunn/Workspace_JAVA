package com.test04;

import java.util.Random;

public class MTest {
	/*
	 * 1. 5칸짜리 int형 1차원 배열을 만들자.
	 * 
	 * 2. 반복문을 사용하여 해당 배열의 앞에서 4개에 5~9사이의 랜덤 숫자를 각각 대입
	 * 
	 * 3. 배열의 4번째 위치한 인덱스에 앞의 4개의 모든 값들을 곱해서 저장
	 * 
	 * 4. 배열을 출력하자.
	 * 
	 * 5. 배열 안의 모든 값을 더해서 출력하자
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		prn01(arr);
		prn02(arr);
		prn03(arr);
		prn04(arr);
	}

	private static void prn04(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		System.out.println("sum of arr = " + sum);
		System.out.println("=====================");
	}

	private static void prn03(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n=====================");
	}

	private static void prn02(int[] arr) {
		// TODO Auto-generated method stub
		int mul = 1;
		for(int i=0;i<4;i++)
			mul *= arr[i];
			
		arr[4] = mul;
		
		System.out.println("multiflex of arr[0~3] = " + arr[4]);
		System.out.println("=====================");
	}
	
	private static void prn01(int[] arr) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i=0;i<4;i++) {
			arr[i] = r.nextInt(5) + 5;
		}
			
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n=====================");
	}
	
	
}
