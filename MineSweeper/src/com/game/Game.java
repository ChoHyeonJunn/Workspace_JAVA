package com.game;

import java.util.Scanner;

import com.make.Mine;

public class Game extends Print {

	private static Scanner sc = new Scanner(System.in);

	public static void playing() {

		System.out.println("START");
		
		Mine mine = new Mine();
		makePrintArr(mine.make());
		
		String isBomb = "";
		
		do {
			int[] inputArr = inputNum();
			
			isBomb = input(inputArr[0], inputArr[1]);
			
			
		}while(!isBomb.equals("*"));
		
		
		System.out.println("BYE!");
	}

	private static int[] inputNum() {
		int[] intArr = new int[2];

		while (true) {
			System.out.println("x와 y의 좌표를 입력해 주세요. (0 ~ 9 사이, 공백으로 구분)");

			try {
				String[] xy = sc.nextLine().split(" ");

				for (int i = 0; i < 2; i++) {
					if (xy[i].length() != 1) {
						throw new Exception();
					} else {
						intArr[i] = Integer.parseInt(xy[i]);
					}
				}
				break;

			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}

		}
		
		return intArr;
	}
}
