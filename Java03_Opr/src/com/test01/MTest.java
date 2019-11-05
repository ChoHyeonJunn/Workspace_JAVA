package com.test01;

public class MTest {

	//전역 변수 field
	//final -> 상수 = 변하지 않는 수, 항상 일정한 수
	public static final int TEN = 10;
	
	
	public static void main(String[] args) {
		opr01(3);
		System.out.println(opr02());
		opr03(10, 1);
		System.out.println(opr04());
		opr05();
		System.out.println(opr06());
		opr07();
	}
	
	//사칙 연산
	public static void opr01(int i) {
	
		//파라미터 i -> 지역변수
		System.out.printf("%d + %d = %d \n", TEN, i, TEN + i);
		System.out.printf("%d - %d = %d \n", TEN, i, TEN - i);
		System.out.printf("%d * %d = %d \n", TEN, i, TEN * i);
		System.out.printf("%d / %d = 몫 : %d 나머지 :  %d \n", TEN, i, TEN / i, TEN % i);		
	}
	
	//대입 연산 ( +=, -=, *=, /=, %= )
	public static String opr02() {
		
		int i = 0;
		System.out.println(i);
		
		i = i + TEN;
		System.out.println(i);
		
		i += TEN;	//i = i + TEN;
		System.out.println(i);
		
		i -= 5;
		System.out.println(i);
		
		i %= 4;
		System.out.println(i);
		
		return "대입연산 끗!";
	}
	
	//증감 연산
	//전위 연산자 : 변수 앞에 연산자를 붙여서, 연산을 먼저하고 값을 나중에 리턴한다.
	//후위 연산자 : 변수 뒤에 연산자를 붙여서, 값을 먼저 리턴하고 연산을 나중에 한다.
	public static void opr03(int a, int b) {
		System.out.println(a);
		System.out.println(a--);	// 10 (9)
		System.out.println(--a);	// 8  (8)
		int res = a++ + ++a + --a + --b;	//8 10 9 0;
		System.out.println(res);
	}

	//논리 연산
	public static boolean opr04() {
		
		//& : 둘다 참(true)이어야 참
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(false & true);	//false
		System.out.println(false & false);	//false
		
		//| : 둘중 하나만 참이면 참
		System.out.println(true | true);	//true
		System.out.println(true | false);	//true
		System.out.println(false | true);	//true
		System.out.println(false | false);	//false
		
		//&& 왼쪽먼저 계산해요~
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false
		System.out.println(false && false);	//false
		
		//|| 왼쪽먼저 계산해요~
		System.out.println(true || true);	//true
		System.out.println(true || false);	//false
		System.out.println(false || true);	//false
		System.out.println(false || false);	//false
		
		int i = 8;
		boolean res = (TEN > i) && (5 < i);
		
		return res;
	}
	
	//비교연산
	public static void opr05() {
		
		System.out.println("======================================");
		System.out.println(true == false);
		System.out.println(5 != 6);
		
	}
	
	//삼항 연산
	//(조건) ? 참 : 거짓;
	public static boolean opr06() {
		
		System.out.println("======================================");
		
		int a = 2;
		int b = 3;
		int i = (a > b) ? a + b : a - b;
		System.out.println(i);
		
		boolean res = false;
		res = (a < b) ? false : true;
		
		String s = (a > b) ? "a 가 b 보다 크다." : (a < b) ? "a 가 b보다 작다" : "a 와 b가 같다.";
		System.out.println(s);
		
		return res;
	}
	
	//비트연산 : &, |, ^, ~, <<, >>
	public static void opr07() {
		
		System.out.println("======================================");
		
		int a = 10;
//		0000 0000 0000 0000 0000 0000 0000 1010
		int b = 2;
//		0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println((a & b));	//연산된 결과가 출력 and
//		0000 0000 0000 0000 0000 0000 0000 1010
//	&	0000 0000 0000 0000 0000 0000 0000 0010
//---------------------------------------------		
//		0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(a | b);	//연산된 결과가 출력	or
//		0000 0000 0000 0000 0000 0000 0000 1010
//	|	0000 0000 0000 0000 0000 0000 0000 0010
//---------------------------------------------			
//		0000 0000 0000 0000 0000 0000 0000 1010
		
		
		int c = TEN;
//		0000 0000 0000 0000 0000 0000 0000 1010
		
		System.out.println(Integer.toBinaryString(c >> 2));	//쉬프트 연산 우로2칸
//      0000 0000 0000 0000 0000 0000 0000 0010

		System.out.println(Integer.toBinaryString(c << 4));	//쉬프트 연산 좌로4칸
//      0000 0000 0000 0000 0000 0000 1010 0000
		System.out.println(c << 4);
		
		
		
		
	}
	
	
	
	
	
	
}
