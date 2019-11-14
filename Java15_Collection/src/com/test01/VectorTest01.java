package com.test01;

import java.util.Vector;

/*
 * 배열과의 가장 큰 차이점은 크기가 가변이라는 것이다!
 */
public class VectorTest01 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(10,5);	//초기크기 10, capacity increments = 5
		
		System.out.println(v.size() + " : " + v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
			System.out.println(v.size() + " : " + v.capacity());
		}
		
		System.out.println("================");
		v.add(10);
		System.out.println(v.size() + " : " + v.capacity());	
		//용량이 늘어나야 할 때 capacity increments 크기 만큼 늘어남!
	}
}
