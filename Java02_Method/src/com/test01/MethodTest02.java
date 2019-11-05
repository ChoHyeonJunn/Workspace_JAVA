package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//메모리 영역 : static / (non-static)
		//static : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();	//private메서드는 not visible
		//MethodTest01.abc();	//선언되지 않은 메서드는 undefined
		
		
		//(non-static)
		//class 변수 = new class();
		//변수.method();
		MethodTest01 methodtest01 = new MethodTest01();
		methodtest01.nonStaticMethod();
		
		//MethodTest01.nonStaticMethod();
		
		
	}
}
