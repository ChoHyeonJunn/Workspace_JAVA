package com.test02;

public class MTest01 {

	/*
	 * A B C D E
	 * F G H I J
	 * K L M N O
	 * P Q R S T
	 * U V W X Y 
	 * Z
	 */
	public static void main(String[] args) {

		int count = 0;
		char c = 'A';
		boolean stop = false;

		while (!stop) {
			while (true) {
				System.out.printf("%2c", c);
				c++;
				count++;
				if (count % 5 == 0) {
					break;
				}
				if (count == 26) {
					stop = true;
					break;
				}
			}

			System.out.println();
		}

	}
}
