package com.test02;

import java.util.Random;
import java.util.Scanner;

public class RandomCube {

	/*
	 * 1. 5*5 숫자를 출력하자 (0~9 사이의 랜덤한 숫자 하나하나를)
	 * 
	 * 2. 만들어진 전체 숫자의 평균을 출력하자.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cube의 크기를 입력하세요! : ");
		int size = sc.nextInt();
		System.out.println("전체 숫자의 평균은 : " + (double) randcube(size) / (size * size) + " 입니다.");

	}

	public static int randcube(int size) {
		int sum = 0;
		Random r = new Random();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int num = r.nextInt(10);
				System.out.print(num + " ");
				sum += num;
			}
			System.out.println();
		}

		return sum;
	}
}
