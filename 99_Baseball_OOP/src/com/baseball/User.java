package com.baseball;

import java.util.InputMismatchException;
import java.util.Scanner;

// 숫자 3개를 입력받는다.
public class User {

	private int inputArr[];
	private int size;

	public User() {
		size = 3;
		inputArr = new int[size];
	}

	public int[] input() {

		System.out.println(size + "개의 숫자를 입력해주세요.");
		System.out.println("각 숫자는 공백으로 구분해주세요. ex) 1 2 3");

		while (true) {

			try {

				Scanner sc = new Scanner(System.in);
				String[] input = sc.nextLine().split(" "); // InputMismatchException

				for (int i = 0; i < input.length; i++) {

					if (input[i].length() > 1) { // 10 이상의 숫자가 들어가면 ArrayIndexOutOfBoundsException 발생
						throw new ArrayIndexOutOfBoundsException();
					}

					inputArr[i] = Integer.parseInt(input[i]); // NumberFormatException
				}

				break;

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}

		return inputArr;
	}
}
