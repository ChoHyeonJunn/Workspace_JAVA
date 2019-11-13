package com.car;

public class Car {

	private String color;
	private int speed;

	public Car() {
		this.speed = 0;
		this.color = "";
	}

	public Car(String color) {
		this.speed = 0;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelPedal() {
		this.speed += 10;
		System.out.println("속도가 올라갑니다.");
	}

	public void breakPedal() {
		this.speed -= 10;
		if (this.speed > 0) {
			System.out.println("속도가 줄어듭니다.");
		} else {
			System.out.println("멈췄습니다.");
			this.speed = 0;
		}
	}

	@Override
	public String toString() {
		return "현재 속도는 " + this.speed + " 입니다.";
	}

}
