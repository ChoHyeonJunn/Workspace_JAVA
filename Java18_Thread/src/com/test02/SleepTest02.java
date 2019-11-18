package com.test02;

class MyThread03 extends Thread {

	private char name;
	
	public MyThread03(char name) {
		this.name = name;
	}

	@Override
	public void run() {
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
				System.out.printf("%s ", name);
			}
			System.out.println();
		}
	}
}

public class SleepTest02 {
	public static void main(String[] args) {

		MyThread03 t01 = new MyThread03('*');
		t01.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread03 t02 = new MyThread03('#');
		t02.start();
	}
}
