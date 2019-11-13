package com.tv;

public class LgTV implements TV {
	
	private int volume;

	public LgTV() {
		this.volume = 0;
	}
	@Override
	public int volumeUp() {
		// TODO Auto-generated method stub
		this.volume += 3;
		return this.volume;
	}

	@Override
	public int volumeDown() {
		// TODO Auto-generated method stub
		this.volume -= 3;
		return this.volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
