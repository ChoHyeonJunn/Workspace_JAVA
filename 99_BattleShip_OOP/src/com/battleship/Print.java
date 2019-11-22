package com.battleship;

public class Print {

	public static final String GAME_START = "---------------배틀쉽 게입입니다----------------\n\n";
	public static final String END_GAME = "---------------배가 모두 폭파 되었습니다!----------------\n\n";
	public static final String GAME_RESTART = "게임을 다시 시작하시겠습니까? (y/n) : \n\n";
	

	public static final String NICE_BOMB = "맞췄습니다!!!";
	public static final String POOR_BOMB = "허공에 날리셨네요...";
	public static final String WRONG_SHIP_CHOSE = "좌표를 다시 선택하세요 제발좀 잘좀찍으세요 길이랑 좀 맞춰서;;";
	

	public static String USER = "";
	
	
	
	public static String getUser() {
		return USER;
	}
	public static void setUser(String str) {
		USER = str;
	}



	public static void printMap(int[][] Map) {
		
		System.out.println("    " + "0 1 2 3 4 5 6 7 8 9\n");
		for (int i = 0; i < Map.length; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < Map[i].length; j++) {
				System.out.print(Map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
}
