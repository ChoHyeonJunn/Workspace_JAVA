package com.main;

import java.util.Scanner;

import com.game.Game;
import com.make.Mine;
import com.make.User;

public class MTest {

	public static void main(String[] args) {
		
		Mine m = new Mine();
		User u = new User();
		
		m.make();
		m.prn();	// 맵 출력
		System.out.println();
		
		Game.playing();
		/*
		u.user();
		u.prnUser();
		
		while(true) {
			
			System.out.println();
			System.out.println("좌표를 입력하세요 (0 ~ 9) : ");
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			u.click(x, y, m.getArr());
			
			u.prnUser();
		}
		*/
		
	}
	
}
