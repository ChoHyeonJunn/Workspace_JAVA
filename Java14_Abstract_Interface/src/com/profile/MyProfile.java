package com.profile;

public class MyProfile extends Profile implements Job, Display {

	private String loc;
	
	public MyProfile(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		super.prn();
		System.out.println("회사주소 : " + loc);
		System.out.println("회사직종 : " + JOB_ID);
	}

	@Override
	public void jobLoc(String loc) {
		// TODO Auto-generated method stub
		this.loc = loc;
	}

}
