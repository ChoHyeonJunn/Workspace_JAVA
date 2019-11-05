package com.test02;

public class FruitBasket {
	
	// field : class 의 속성
	static int size = 30;
	public int fruitCount = 5;
	private String fruitName;
	
	// method : class 의 기능
	public void setting(String str, int i) {
		fruitName = str;
		fruitCount += i;
		
		basketPrn();
	}
	
	private void basketPrn() {
		if(size >= fruitCount) {
			System.out.println(fruitName + "의 갯수는 " + fruitCount + "입니다. ");
		}
		else {
			System.out.println("바구니가 꽉 찼습니다. ");
		}
		
		//이런 식으로도 가능!!
		//String res = (size >= fruitCount) ? 
		//		fruitName + "의 갯수는" + fruitCount + " 개 입니다.":
		//			"바구니가 꽉 찼습니다.";
	}
}
