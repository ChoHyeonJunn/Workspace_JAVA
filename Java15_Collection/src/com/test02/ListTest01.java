package com.test02;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("홍길동");
		list.add("이순신");
		list.add("강호동");
		list.add("유재석");
		list.add("신동엽");
		list.add("조세호");

		// prn(list);

		transEelement(list);
	}

	private static void transEelement(List<String> list) {
		// 1. 홍길동을 김길동으로 바꾸자
		for (String s : list) {
			if (s.equals("홍길동")) {
				list.set(list.indexOf(s), "김길동");
			}
		}
		prn(list);

		// 2. "신"으로 끝나는 객체를 찾아서, 만일 있다면 "신"을 "자" 로 바꾸자
		for (String s : list) {
			if (s.endsWith("신")) {
				list.set(list.indexOf(s), s.replace("신", "자"));
			}
		}
		prn(list);

		// 3. "호"로 끝나는 객체를 찾아서, 만일 있다면 삭제하자.
		for (String s : list) {
			if (s.endsWith("호")) {
				list.remove(list.indexOf(s));
				break;
			}
		}
		prn(list);
	}

	public static void prn(List<String> list) {

		// {이름, 이름, 이름, ...}
		System.out.print("{ ");
		for (String s : list) {
			System.out.print(s);
			if (list.indexOf(s) != list.size() - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}
}
