package com.test02;

public class MTest {

	/*
	 * class diagram을 보고 furitsBasket class 를 작성하자
	 *  - fruitCount의 초기값은 5 이다.
	 *  - Setting 메서드를 호출할 때 size 변수에 30을 대입하자
	 *  - setting 메서드의 string 파라미터는 과일의 이름을 받아서 fruitName 변수에 대입하고,
	 *    int 변수는 과일의 갯수를 받아서 fruitCount 변수에 더해서 대입하자(+=)
	 *  - basketPrn 메서드는 size와 fruitCount의 값을 배교해서 size가 크거나 같으면 
	 *    과일이름+"의 갯수는 "+갯수+"입니다. "
	 *    작으면 "바구니가 꽉 찼습니다." 를 출력한다.
	 */
	
	public static void main(String[] args) {
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.setting("바나나", 20);
		
		//size 변수는 static 이기 때문에 appleBasket 에도 영향을 미침
		//bananaBasket.size = 100;
		//FruitBasket.size = 100;	//노란줄 오류는 이렇게 해결 static 하게 접근
		//System.out.println(bananaBasket.size);
		
		//fruitCount는 non-static이기 때문에 객체 하나에만 영향을 미침
		bananaBasket.fruitCount = 100;
		System.out.println(bananaBasket.fruitCount);
		//FruitBasket.fruitCount = 100;	//non-static 변수에 맘데로 접근할 수 없어용~
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.setting("사과", 30);				
		//System.out.println(appleBasket.size);
		System.out.println(appleBasket.fruitCount);
	}

}
