package com.coffee03;

import java.util.Scanner;

public class CoffeeMachine {

	public void inputMoney() {

		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("메뉴 : (1. 일반 : 300원) (2. 고급 : 500원)");
			int kind = sc.nextInt();
			System.out.println("돈을 넣어 주세요.");
			int money = sc.nextInt();

			if (kind == 1) {

				if (money >= 300) {
					System.out.println("커피 몇 잔이 필요하신가요?");
					int count = sc.nextInt();

					if (money >= 300 * count) {
						coffeeMakeC(money, count);
					} else {
						System.out.println("금액이 부족합니다.");
						System.out.println("잔돈은 " + money + "원 입니다.");
					}

				} else {
					System.out.println("금액이 부족합니다.");
					System.out.println("잔돈은 " + money + "원 입니다.");
				}
			} else if (kind == 2) {
				if (money >= 500) {
					System.out.println("커피 몇 잔이 필요하신가요?");
					int count = sc.nextInt();

					if (money >= 500 * count) {
						coffeeMakeG(money, count);
					} else {
						System.out.println("금액이 부족합니다.");
						System.out.println("잔돈은 " + money + "원 입니다.");
					}

				} else {
					System.out.println("금액이 부족합니다.");
					System.out.println("잔돈은 " + money + "원 입니다.");
				}
			} else {
				System.out.println("없는 메뉴입니다. 1 or 2 중 선택해 주세요!");
			}
		} while (true);
	}

	// 받은 돈으로 커피 만들기
	private void coffeeMakeC(int money, int count) {
		int change = money - (300 * count);

		System.out.println("일반 커피 " + count + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");

	}

	private void coffeeMakeG(int money, int count) {
		int change = money - (500 * count);

		System.out.println("고오급 커피 " + count + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");

	}
}
