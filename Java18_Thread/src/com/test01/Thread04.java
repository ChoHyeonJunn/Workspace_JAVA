package com.test01;



public class Thread04 {

	public static void main(String[] args) {
		MyThread03 cat = new MyThread03("야옹");
		MyThread03 dog = new MyThread03("멍멍");
		
		
		long startTime = System.currentTimeMillis();
		
		cat.start();
		try {
			//cat thread 가 종료될 때 까지 다른 thread 를 멈춘다!!!!!
			cat.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		dog.start();
		
		
		long endTime = System.currentTimeMillis();
		
		
		//cat이 실행된 후에 실행시간이 나오고 dog가 실행된다.
		System.out.println("==================실행시간 : " + (endTime - startTime));
		
	}
}
