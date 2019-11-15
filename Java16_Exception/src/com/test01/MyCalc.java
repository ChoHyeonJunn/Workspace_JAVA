package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {

	public int inputNum() {
		int n = 0;

		System.out.println("숫자만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		return n;
	}

	public int calculation() {
		int res = 0;

		while (true) {
			try {
				res = inputNum() / inputNum();
				String a = "1ㄶ0";
				int i = Integer.parseInt(a);
				System.out.println(res);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자 입력 에러");
				// e.printStackTrace(); //console 창에 나오는 에러메시지 를 의미한다.
			} catch (NumberFormatException e) {
				System.out.println("숫자 변환 에러");
				e.printStackTrace();
			} finally {
				//finally 는 에러가 나든 안나든 무조건 실행된다!!!
				System.out.println("------------------------------------------------");
			}
		}
		return res;
	}
}
