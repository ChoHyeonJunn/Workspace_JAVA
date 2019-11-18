package com.test02;



public class SleepTest {
	public static void main(String[] args) {

		while (true) {
			for (int i = 1; i <= 10; i++) {
				try {
					// 아규먼트 = millieSecond
					// 아규먼트의 수 만큼 멈췄다가 실행!
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.printf("%c ", '*');
			}
			System.out.println();
		}
	}
}
