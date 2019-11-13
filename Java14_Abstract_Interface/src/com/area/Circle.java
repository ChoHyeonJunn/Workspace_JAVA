package com.area;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해 주세요 : ");

		double r = sc.nextDouble();
		super.setResult(Double.toString(r * r * Math.PI));

	}

	public void print() {
		System.out.print("원의 ");
		super.print();
	}
}
