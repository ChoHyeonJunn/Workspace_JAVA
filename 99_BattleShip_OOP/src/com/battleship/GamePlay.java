package com.battleship;

import java.util.Scanner;

public class GamePlay {

	/*
	 * battle ship game
	 * 
	 * 1. 10*10 맵이 주어짐
	 * 
	 * 2. 각 사용자는 캐리어(5), 배틀쉽(4), 구축함(2) 총 세척을 자신의 맵에 입력한다 뱃머리, 꼬리 의 좌표를 입력하는 식으로 각
	 * 배는 ' / ' 로 구분
	 * 
	 * 3. 상대방의 맵에 좌표를 찍어 폭격함 타격은 선택한 부분만, 상하좌우 1칸공격 2개, 2칸 공격 2개는 주어짐
	 * 
	 * 4. 상대방의 맵에 있는 모든 배의 좌표를 다 없애면 게임 종료
	 * 
	 */

	static Scanner sc = new Scanner(System.in);
	static Map map = new Map();
//	
//	public static void main(String[] args) {
//		
//		
//		while(true) {
//			if(map.noMoreShip(map.getMap())) {
//				System.out.println(Print.END_GAME);
//				System.out.println(Print.GAME_RESTART);
//				break;
//			}
//			
//			System.out.println("폭격할 좌표를 입력하세욧 : ");
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			if(ThrowBomb.getBomb(map.getMap(), new Pair<Integer, Integer>(x, y))) {
//				map.setMap(map.getMap(), x, y);
//			}
//			
//			Print.printMap(map.getMap());
//		}
//	}

	public static void start(String str) {
		Print.printMap(map.getMap());
		System.out.println(str);
		System.out.println(Print.GAME_START);

		choseShip(map);
		Print.printMap(map.getMap());
	}
	
	private static void choseShip(Map map) {
		int hi, hj, ti, tj;
		while (true) {

			System.out.println("캐리어 머리 좌표 : ");
			hi = sc.nextInt();
			hj = sc.nextInt();
			System.out.println("캐리어 꼬리 좌표(캐리어 길이는 5 입니다!!!) : ");
			ti = sc.nextInt();
			tj = sc.nextInt();

			if (map.setCarrier(Pair.of(hi, hj), Pair.of(ti, tj)))
				break;
			else
				System.out.println(Print.WRONG_SHIP_CHOSE);
		}

		while (true) {

			System.out.println("배틀쉽 머리 좌표 : ");
			hi = sc.nextInt();
			hj = sc.nextInt();
			System.out.println("배틀쉽 꼬리 좌표(배틀쉽 길이는 4 입니다!!!) : ");
			ti = sc.nextInt();
			tj = sc.nextInt();

			if (map.setBattleship(Pair.of(hi, hj), Pair.of(ti, tj)))
				break;
			else
				System.out.println(Print.WRONG_SHIP_CHOSE);
		}

		while (true) {

			System.out.println("순항함 머리 좌표 : ");
			hi = sc.nextInt();
			hj = sc.nextInt();
			System.out.println("순항함 꼬리 좌표(순항함 길이는 2 입니다!!!) : ");
			ti = sc.nextInt();
			tj = sc.nextInt();

			if (map.setFightship(Pair.of(hi, hj), Pair.of(ti, tj)))
				break;
			else
				System.out.println(Print.WRONG_SHIP_CHOSE);
		}
	}
}
