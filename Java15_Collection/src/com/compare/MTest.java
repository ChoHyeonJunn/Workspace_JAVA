package com.compare;

import java.util.Arrays;

public class MTest {

	public static void main(String[] args) {
		Score[] students = new Score[3];
		
		students[0] = new Score("백승아", 100, 17, 21);
		students[1] = new Score("조현준", 110, 18, 22);
		students[2] = new Score("이우준", 100, 8, 7);

		
		for(Score tmp : students) {
			System.out.println(tmp);
			System.out.println();
		}
		
		Arrays.sort(students);
		System.out.println("=======================");
		
		for(Score tmp : students) {
			System.out.println(tmp);
			System.out.println();
		}
	}
}
