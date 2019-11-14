package com.profile;

public class MTest {

	/*
	 * Profile 과 Display, Job 을 상속받는
	 * MyProfile 클래스를 만들자. 
	 */
	public static void main(String[] args) {
		MyProfile my = new MyProfile("kh", "010-1234-5678");
		my.jobLoc("강남");
		my.display();
	}
}
