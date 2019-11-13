package com.area;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이를 입력해 주세요 : ");
		System.out.println("높이를 입력해 주세요 : ");

		int x = sc.nextInt();
		int y = sc.nextInt();
		super.setResult(Double.toString((double)(x * y) / 2));
	}

	public void print() {
		System.out.print("삼각형의 ");
		super.print();
	}
}
