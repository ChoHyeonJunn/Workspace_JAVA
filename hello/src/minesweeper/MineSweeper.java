package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	static Scanner sc = new Scanner(System.in);

	private static int[][][] Map = new int[10][10][2];
	private static char[][] gameBoard = new char[10][10];

	private static int[][] direct = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
			{ -1, -1 } };

	public static void main(String[] args) {

		boolean play = false;
		do {
			initMap();

			playGame();
			
			System.out.println("게임을 다시 시작 하시겠습니까? : Y / N");
			String select = sc.next();
			
			if(select.contentEquals("Y") || select.contentEquals("y"))
				play = true;
			else {
				play = false;
				System.out.println("게임 종료...");
			}
		} while (play);
	}

	private static void playGame() {
		// 게임 시작
		while (true) {
			printMap(); // 맵 출력!!

			System.out.println("원하는 행 열을 입력하시오 : ");
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (!touch(x, y)) {
				printMap();

				System.out.println("==============================");
				System.out.println("======  지뢰를 밟았다!  ======");
				System.out.println("==============================");

				break;
			}
		}
	}

	private static boolean touch(int x, int y) {

		Map[x][y][1] = 1;

		if (Map[x][y][0] == 99) {
			return false;
		} else {
			for (int i = 0; i < 4; i++) {

				int mx = x + direct[i][0];
				int my = y + direct[i][1];

				if (0 <= mx && mx < 10 && 0 <= my && my < 10) {
					if (Map[mx][my][1] == 0) {
						if (Map[mx][my][0] == 0)
							touch(mx, my);
						if (Map[x][y][0] == 0 && Map[mx][my][0] != 99)
							touch(mx, my);
					}
				}
			}

			return true;
		}

	}

	private static void printMap() {
		System.out.println("    " + "0 1 2 3 4 5 6 7 8 9\n");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < 10; j++) {
				System.out.print(Map[i][j][0] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("    " + "0 1 2 3 4 5 6 7 8 9\n");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < 10; j++) {
				if (Map[i][j][1] == 0)
					System.out.print(gameBoard[i][j] + " ");
				else
					System.out.print(Map[i][j][0] + " ");
			}
			System.out.println();
		}
	}

	private static void initMap() {
		// 맵 초기화
		Random r = new Random();
		int count = 10;

		while (count-- > 0) {
			int x = r.nextInt(10);
			int y = r.nextInt(10);

			if (Map[x][y][0] != 99) {
				Map[x][y][0] = 99;

				for (int i = 0; i < 8; i++) {
					int mx = x + direct[i][0];
					int my = y + direct[i][1];

					if (0 <= mx && mx < 10 && 0 <= my && my < 10) {
						if (Map[mx][my][0] != 99) {
							Map[mx][my][0]++;
						}
					}
				}
			}
		}

		// 게임판 초기화
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				gameBoard[i][j] = 'A';
			}
		}
	}

}
