package com.test03;

public class SumX {

	/*
	 * 1  2  3  4  5 
	 * 6  7  8  9  10 
	 * 11 12 13 14 15 
	 * 16 17 18 19 20 
	 * 21 22 23 24 25
	 * 
	 * x의 총합
	 * x의 평균
	 */
	private static int count = 0;
			
	public static void main(String[] args) {
		int sum = sumX();
		System.out.println("sumX 의 합은 : " + sum);
		System.out.println("sumX 의 갯수 : " + count);
		System.out.println("sumX 의 평균 : " + (double)sum/count);
	}

	public static int sumX() {
		int sum = 0;
		int x = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == j) {
					sum += x;
					count++;
					System.out.print("x\t");
				} else if (i + j == 4) {
					sum += x;
					count++;
					System.out.print("x\t");
				} else {
					System.out.print(x + "\t");
				}
				
				x++;
			}
			System.out.println();

		}
		return sum;
	}
}
