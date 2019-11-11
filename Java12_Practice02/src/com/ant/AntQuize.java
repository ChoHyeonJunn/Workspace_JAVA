package com.ant;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.Scanner;

public class AntQuize {

	/*
	 * 개미수열
	 * 
	 * 베르나르 베르베르
	 * 
	 * 몇단계 까지 출력할지 입력받고 출력
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("베르나르 베르베르의 개미수열!");
		System.out.println("몇단계까지 출력할까요? : ");
		int dep = sc.nextInt();

		// 개미수열 본체
		int[][] antArray = new int[dep][];
		// 개미수열 초기 0, 1 depth
		antArray[0] = new int[] { 1 };
		antArray[1] = new int[] { 1, 1 };
		
		
		// 개미수열 메서드 불러오기
		for (int i = 1; i < dep - 1; i++) {
			antMethod(antArray, i);
		}

		// 정답 출력
		for (int i = 0; i < antArray.length; i++) {
			for (int j = 0; j < antArray[i].length; j++) {
				System.out.print(antArray[i][j]);
			}
			System.out.println();
		}

	}

	private static void antMethod(int[][] antArray, int depth) {

		int leng = getCount(antArray, depth);
		int[] tAnt = new int[leng]; // depth + 1 번째 배열의 길이를 구해 초기화

		int index = 0;
		int num = antArray[depth][0];

		tAnt[0] = antArray[depth][0];
		tAnt[1] = 1;
		
		for (int i = 1; i < antArray[depth].length; i++) {
			if (antArray[depth][i] != num) {
				index += 2;

				num = antArray[depth][i];
				tAnt[index] = antArray[depth][i];
				tAnt[index + 1] = 1;
			} else {
				tAnt[index + 1]++;
			}
		}		
		antArray[depth + 1] = tAnt;
	}

	// depth + 1 의 길이가 몇인지 구하는 함수
	private static int getCount(int[][] antArray, int depth) {

		int leng = 1;
		int num = antArray[depth][0];

		for (int i = 1; i < antArray[depth].length; i++) {
			if (antArray[depth][i] != num) {
				leng++;
			}
			num = antArray[depth][i];
		}
		return leng * 2;

	}

}
