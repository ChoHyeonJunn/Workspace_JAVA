package com.lotto;

public class MTest {

	public static void main(String[] args) {
		int[] lottoNum = new int[7];
		
		Lotto.prn01(lottoNum);
		
		for(int i=0;i<lottoNum.length;i++)
			System.out.print(lottoNum[i] + " ");
	}
}
