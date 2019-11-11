package com.lotto;

import java.util.Random;

/*
 * 1~45 사이의 "중복되지 않는" 난수 7개를 만들고,
 * 
 * 정렬해서 출력하자
 *  
 */

public class Lotto {

	static Random r = new Random();

	public static void prn01(int[] lottoNum) {

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j])
					i--;
			}
		}

	}
}
