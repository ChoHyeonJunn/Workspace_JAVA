package com.baseball;

public class Print {

	static String ING_PRE = "[ ";
	static String ING_POST = "번 째 도전 ]";

	static String LOSE_PRE = "답은 ";
	static String LOSE_POST = " 였습니다 졌어요ㅠㅠ";
	
	static String START = "게임이 시작됩니다!";

	static String ERROR = "예상치 못한 상황으로 인해 게임이 종료됩니다.";

	static String WIN = "이겼습니다!";
	
	static String END = "게임이 끝났습니다.\n 다시 시작할까요? (y/n)";
	static String BYE = "수고하셨습니다~!";
	
	static void strikePrn(int[] output) {
		
		if(output[2] == 3) {
			System.out.println("OUT!!!");
		} else {
			System.out.printf("--------- %d STRIKE  %d BALL ---------------------\n", output[0], output[1]);
		}
	}
}
