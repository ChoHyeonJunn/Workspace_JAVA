package com.test01;

class MyThread implements Runnable {

	private String str;
	
	MyThread(String str){
		this.str = str;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str + " : i : " + i);
		}

	}

}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("============================================");

		// Thread 가 아니다
//		MyThread t01 = new MyThread();
//		MyThread t02 = new MyThread();
//		
//		t01.run();
//		t02.run();

		// Thread 이다. -> 동시에 실행된다!!!! = 병렬실행된다 = 빠르다
		Thread t01 = new Thread(new MyThread("t01"));
		Thread t02 = new Thread(new MyThread("t02"));
		
		t01.start();
		t02.start();
		
		System.out.println("============================================");
		// main() Thread 가 최 우선 이기 때문에 줄 두개가 먼저 출력된다.!
	}

}
