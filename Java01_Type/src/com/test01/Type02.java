package com.test01;

public class Type02 {

	// 정수형 리터럴 : byte(1)	short(2)	int(4)	long(8)
	public static void main(String[] args) {

		// Type 변수 = 값;

		byte b01 = 126;
		System.out.println(b01);

		byte b02 = (byte) 128; // casting (형 변환) -> 정수형의 기본 타입은 int ->
		System.out.println(b02);

		byte b03 = (byte) (b01 + b02); // 연산의 기본은 int 이기 때문에 byte로 강제 형변환 하여 저장
		System.out.println(b03);

		System.out.println(
				"==============================================================================================================");

		short s01 = 32767;
		System.out.println(s01);

		short s02 = 2;
		System.out.println(s02);

		short s03 = (short) (s01 + s02);
		System.out.println(s03);

		System.out.println(
				"==============================================================================================================");

		int i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);

		int sum = i + j;
		System.out.println(sum);

		System.out.println(
				"==============================================================================================================");

		long l01 = 3000000000L;
		long l02 = 4000000000l;
		long sumL = l01 + l02;
		System.out.println(sumL);

		System.out.println(
				"==============================================================================================================");

		// 0b : 2진수
		System.out.println(0b10);
		// 00 : 8진수
		System.out.println(0010);
		// 0x : 16진수
		System.out.println(0x10);

		System.out.println(
				"==============================================================================================================");

	}
}
