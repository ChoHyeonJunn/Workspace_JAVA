package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {

	public static void main(String[] args) {
		MethodTest01.publicMethod();
		//MethodTest01.protectedMethod();
		//MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		MethodTest01 methodtest01 = new MethodTest01();
		methodtest01.nonStaticMethod();
		
		//UML : Unified Modeling language
		//http://www.objectaid.com/update/current 에서 다운받았다~		
	}
}
