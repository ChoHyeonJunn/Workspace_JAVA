package com.point;

import java.util.Scanner;

public class PointLength {

	public static void main(String[] args) {
		
		//(0, 0) ~ (x, y) 의 거리를 구하자
		//x와y는 scanner를 통해 입력 받자.
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" x, y 좌표를 입력해 주세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("(0, 0) 부터 (x, y) 까지의 거리는 " + zeroToXY(x, y) + " 입니다.");
	}
	
	public static double zeroToXY(int x, int y) {
		double res;
		
		res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		
		return res;
	}
}
