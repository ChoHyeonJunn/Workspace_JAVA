package com.lotto;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int lottoNum[] = new int[6];
		
		Random r = new Random();
		
		for(int i=0;i<6;i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			
			for(int j=0;j<i;j++) {
				if(lottoNum[i] == lottoNum[j])
					i--;
			}
		}
		
	}
}
