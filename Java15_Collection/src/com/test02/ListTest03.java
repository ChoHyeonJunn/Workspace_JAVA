package com.test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("김길동");
		list.add("신길동");
		list.add("김길동");
		list.add("박길동");
		
		System.out.println(list);
	}
}
