package com.test01;

class MyThread02 extends Thread {
	private String str;
	
	public MyThread02(String str) {
		this.str = str;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str + " : i : " + i);
		}
	}
}

public class Thread02 {
	public static void main(String[] args) {
		MyThread02 t01 = new MyThread02("t01");
		MyThread02 t02 = new MyThread02("t02");
		
		t01.start();
		t02.start();
	}
}
