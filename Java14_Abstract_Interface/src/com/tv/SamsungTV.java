package com.tv;

public class SamsungTV implements TV {

	private int volume;
	
	public SamsungTV() {
		this.volume = 0;
	}
	
	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		this.volume += 2;
		return this.volume;
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		this.volume -= 2;
		return this.volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
