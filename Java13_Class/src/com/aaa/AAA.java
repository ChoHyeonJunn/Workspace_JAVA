package com.aaa;

public class AAA {

	// field : 속성
	private int abc;

	// default constructor(기본 생성자)
	public AAA() {
		System.out.println("AAA() 생성");
	}
	
	public AAA(int abc) {
		this.abc = abc;
		System.out.println("AAA(abc) 생성");
	}

	// getter & setter
	public int getAbc() {
		return abc;
	}
	
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	public void prn() {
		System.out.println("AAA의 메서드 prn()");
	}
	
}
/*
 * <생성자>
 * 1. 클래스의 이름과 동일하되, 리턴타입은 없고, 객체 생성시의 접근 제한자는 public 이다.
 * 
 * class Test{
 * 	public Test(){
 * 		//생성자 입니다.
 * 	}
 * }
 * 
 * 
 * 2. 생성자는 객체 생성을 하는 new 연산자와 함께 사용되며, 생성시 단 한번만 자동 호출된다.
 * 
 * Test t = new Test();
 * 	// new 생성자();
 * 
 * 
 * 3. 메서드처럼 객체 및 클래스명으로 호출될 수 없다.
 * t.Test(); X
 * Test.Test(); X
 * 
 * 
 * 4. overload 할 수 있다.
 * 
 * Class Test{
 * 	public Test() {}	//defualt constructor (기본 생성자)
 * 	public Test(int a) {}
 *  public Test(int a, int b) {}
 * }
 * 
 * 
 * 5. 생성자를 명시하지 않으면 자바가 기본 생성자를 제공하여 필드를 초기화하고, 명시된 생서자를 선언하게 되면 명시 생성자만 호출되고 기본 생성자는 제공되지 않는다.
 * 
 * Class AA{
 * 							//new AA(); O
 * }
 * Class BB{
 * 	public BB(){}			//new BB(); O
 * }
 * Class CC{
 * 	public CC(int cc) {}	//new CC(); X	-> new CC(10); O
 * }
 * 
 * 
 * 6. 생성자는 상속되지 않는다.
 * 
 * 
 * 7. 생성자는 내부 호출이 가능하며, 키워드는 this() 이다.
 * 
 * 
 * 8. 생성자의 목적은 객체 생성과 필드 초기화에 있다.
 * */


























