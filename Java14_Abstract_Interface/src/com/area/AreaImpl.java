package com.area;

public abstract class AreaImpl implements Area {

	private String result;
		
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(PRINT + result);
	}

	@Override
	public abstract void make();

}
