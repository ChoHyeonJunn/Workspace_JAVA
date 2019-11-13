package com.car;

public class Truck extends Car{

	public Truck() {
		super.setSpeed(0);
		super.setColor("black");
	}

	public Truck(String color) {
		super.setSpeed(0);
		super.setColor(color);
	}

	public void accelPedal() {
		super.setSpeed(super.getSpeed() + 5);
		System.out.println("속도가 느리게 올라갑니다.");
	}

	public void breakPedal() {
		super.setSpeed(super.getSpeed() - 5);
		if (super.getSpeed() > 0) {
			System.out.println("속도가 느리게 내려갑니다.");
		} else {
			System.out.println("멈췄습니다.");
			super.setSpeed(0);
		}
	}

	@Override
	public String toString() {
		return "Truck 의 현재 속도는 " + super.getSpeed() + " 입니다.";
	}
}
