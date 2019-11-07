package com.coffee01;

import java.util.Scanner;

public class CoffeeMachine {

	// 돈 받기
	public void inputMoney() {
		
		System.out.println("돈을 넣어 주세요. \n(한 잔당 300원)");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		if(money >= 300) {
			coffeeMake(money);
		}else {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈은 " + money + "원 입니다.");
		}
		
	}

	// 받은 돈으로 커피 만들기
	private void coffeeMake(int money) {
		
		int coffee = money/300;
		int change = money%300;
		
		System.out.println("커피 " + coffee + "잔 나왔습니다.");
		System.out.println("잔돈은 " + change + "원 입니다.");
		
	}
}
