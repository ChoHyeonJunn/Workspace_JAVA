package com.Bomb;

import java.util.Scanner;

/*
 * <폭탄게임>

1. 맵의 크기를 받는다 (최대 10)
2. 폭탄은 3종류이며, 각 폭탄의 영향범위는 다음과 같다.
    A:상하좌우 1칸
    B:상하좌우 2칸
    C:상하좌우 3칸
3. 입력은 '/' 로 나누며, 띄어쓰기를 하지 않고 xy.../xy.../xy... 형식으로 입력한다.
    (ex : 0192/22980977/55 ) -> A폭탄 2개, B폭탄 4개, C폭탄 1개
4. 각 폭탄의 입력은 1개 이상 4개 이하로 제한한다.
5. 폭탄이 터진 후의 맵을 출력하라.
    (폭탄의 범위가 닿지 않는 범위와 닿은 범위의 차이만 있으면 됨)
 */
public class Bomb {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][] direct = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static void main(String[] args) {

		System.out.println("맵의 크기 : ");
		N = sc.nextInt();

		int[][] Map = new int[N][N];
		int[][] Bomb = new int[N][N];

		getBomb(Map, Bomb);


		getDamage(Map, Bomb);


		
		print(Map, Bomb);
	}

	
	
	private static void print(int[][] map, int[][] bomb) {
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(bomb[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}



	private static void getDamage(int[][] map, int[][] bomb) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (bomb[i][j] != 0) {

					for (int k = 0; k < 4; k++) { // k 방향
						for (int q = 0; q < bomb[i][j]; q++) { // q 길이
							int x, y;
							if (direct[k][1] == 0) {
								if (direct[k][0] > 0) {
									x = i + direct[k][0] + q;
									y = j + direct[k][1];
								} else {
									x = i + direct[k][0] - q;
									y = j + direct[k][1];
								}
							} else {
								if (direct[k][1] > 0) {
									x = i + direct[k][0];
									y = j + direct[k][1] + q;
								} else {
									x = i + direct[k][0];
									y = j + direct[k][1] - q;
								}
							}

							if (0 <= x && x < N && 0 <= y && y < N) {
								map[x][y] = bomb[i][j];
							}
						}

					}

				}
			}
		}

	}

	private static void getBomb(int[][] map, int[][] bomb) {
		System.out.println("폭탄 입력 : ");
		String str = sc.next();

		int bomLeng = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '/') {
				bomLeng++;
				continue;
			} else {
				int x = Integer.parseInt(str.substring(i, i + 1));
				int y = Integer.parseInt(str.substring(i + 1, i + 2));
				System.out.println(x + " " + y + " 폭탄의 길이는 " + bomLeng);

				bomb[x][y] = bomLeng;
				map[x][y] = bomLeng;
				i++;
			}
		}
	}

}
