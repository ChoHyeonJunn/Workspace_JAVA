package com.test02;

public class Gugu {
	public static void main(String[] args) {
		gugu01();
		System.out.println("=======================");
		gugu02(1);
		System.out.println("=======================");
		gugu03();
	}

	public static void gugu01() {
		//2단 ~ 9단 전체 출력 (for)
		
		for(int i=2;i<=9;i++) {
			System.out.println(i + "단 ");
			for(int j=1;j<=9;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
	
	public static void gugu02(int i) {
		//i단만 출력 (for)
		
		System.out.println(i + "단 ");
		for(int j=1;j<=9;j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}
	
	public static void gugu03() {
		//2단 ~ 9단 전체 출력 (while)
		int i=2;
		
		while(i<=9) {
			System.out.println(i + "단 ");
			int j=1;
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}
}
