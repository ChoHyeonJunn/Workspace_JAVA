package com.test01;

import java.io.File;

public class MTest05 {

	public static void main(String[] args) {
		File fi = new File("C:\\");
		// prn01(fi);

		/*
		 * dir 의 총 갯수 : 몇개 file의 총 갯수 : 몇개
		 */
		prn02(fi);

	}

	public static void prn01(File fi) {

		for (String list : fi.list()) {
			System.out.println(list); // c드라이브에 있는 모든 폴더, 파일이 다 나옵니다! 숨김파일 포함
		}

	}

	public static void prn02(File fi) {
		int dir = 0;
		int file = 0;

		for (File list : fi.listFiles()) {

			if (list.isDirectory()) {
				dir++;
				System.out.println("dir : " + list.getName());
			}
			if (list.isFile()) {
				file++;
				System.out.println("file : " + list.getName());
			}
		}

		System.out.println("dir 의 총 갯수 : " + dir);
		System.out.println("file 의 총 갯수 : " + file);
	}
}
