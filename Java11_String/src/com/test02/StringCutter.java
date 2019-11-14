package com.test02;

import java.util.StringTokenizer;

public class StringCutter {

	public static void main(String[] args) {

		String str = "The String class represents character strings.";

		// 1. substring 메서드로 자르기!!
		System.out.println(str.substring(4, 10));

		// 2. 
		String[] tmp = str.split(" ");
		System.out.println(tmp[1]);
		
		// 3. StringTokenizer : split 이랑 비슷한데 잘라서 자기가 가지고 있다가 
		String str2 = "represents.character.strings.";
		StringTokenizer st = new StringTokenizer(str2, ".");
		while(st.hasMoreElements()) {
			//System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			System.out.println(st.nextElement());
		}
	}
}
