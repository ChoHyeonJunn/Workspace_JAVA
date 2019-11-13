package com.car;

public class SportsCar extends Car {

	public SportsCar() {
		super.setSpeed(0);
		super.setColor("black");
	}

	public SportsCar(String color) {
		super.setSpeed(0);
		super.setColor(color);
	}

	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 15);
		System.out.println("속도가 빠르게 올라갑니다.");
	}

	public void breakPedal() {
		super.setSpeed(super.getSpeed() - 15);
		if (super.getSpeed() > 0) {
			System.out.println("속도가 빠르게 내려갑니다.");
		} else {
			System.out.println("멈췄습니다.");
			super.setSpeed(0);
		}
	}

	@Override
	public String toString() {
		return "SportsCar 의 현재 속도는 " + super.getSpeed() + " 입니다.";
	}
}
