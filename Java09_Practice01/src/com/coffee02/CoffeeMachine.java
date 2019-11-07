package com.coffee02;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {

		System.out.println("돈을 넣어 주세요. \n(한 잔당 300원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if (money >= 300) {
			System.out.println("커피 몇 잔이 필요하신가요?");
			int count = sc.nextInt();

			if (money >= 300 * count) {
				coffeeMake(money, count);
			} else {
				System.out.println("금액이 부족합니다.");
				System.out.println("잔돈은 " + money + "원 입니다.");
			}

		} else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}

	}

	// 받은 돈으로 커피 만들기
	private void coffeeMake(int money, int count) {
		int change = money - (300 * count);

		System.out.println("커피 " + count + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");

	}

}
