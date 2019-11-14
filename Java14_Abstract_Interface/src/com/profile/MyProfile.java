package com.profile;

public class MyProfile extends Profile implements Job, Display {

	private String loc;
	
	public MyProfile(String name, String phone) {
		// TODO Auto-generated constructor stub
		super(name, phone);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.prn();
		System.out.println("회사주소 : " + loc);
		System.out.println("회사직종 : " + JOB_ID);	
		//super.JOB_ID -> X : 부모 클래스만 super가능, JOB_ID 를 가지고 있는 Job 은 interface 이다.
	}

	@Override
	public void jobLoc(String loc) {
		// TODO Auto-generated method stub
		this.loc = loc;
	}

}
