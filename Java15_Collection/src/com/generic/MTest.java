package com.generic;

public class MTest {

	public static void main(String[] args) {

		Emp<String> samsong = new Emp<String>();
		samsong.setEname("홍길동");
		samsong.setEmpno("dev0015");

		Emp<Integer> ig = new Emp<Integer>(19019, "이순신");

		Emp dhit = new Emp("abcd", "김선달");

		System.out.println(samsong);
		System.out.println(ig);
		System.out.println(dhit);

	}
}
