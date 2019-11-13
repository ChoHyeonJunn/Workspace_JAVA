package com.car;

public class MTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.accelPedal();
		car1.accelPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println(car1);
		car1.breakPedal();
		
		System.out.println("===================");
		
		Car car2 = new SportsCar("빨간색");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		
		System.out.println("===================");
		
		Car car3 = new Truck("다라이색");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();
	}
	
	
	
}
