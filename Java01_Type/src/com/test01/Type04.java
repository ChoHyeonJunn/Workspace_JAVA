package com.test01;

public class Type04 {
	
	//문자형, 문자열, 논리형
	
	public static void main(String[] args) {
		
		//문자형 ''
		char c01 = 'a';
		System.out.println(c01);
		
		char c02 = 'b';
		char sumC = (char) (c01 + c02);
		System.out.println(sumC);
		
		
		System.out.println(
				"==============================================================================================================");
		
		//문자열 ""
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		System.out.println(
				"==============================================================================================================");
		
		//unicode도 가능 - C:\Program Files\Java\jdk1.8.0_231\bin\native2ascii 실행해서 조회 가능
		char lastName = '\uc870';
		String firstName = "\uc870\ud604\uc900";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		System.out.println(
				"==============================================================================================================");
		
		//논리형
		boolean bl01 = true;
		boolean bl02 = false;
		System.out.println(bl01);
		System.out.println(bl02);
		
	}
}
