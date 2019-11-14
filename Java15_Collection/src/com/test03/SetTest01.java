package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {

		/*
		 * Set
		 * 1. 순서가 없다 -> add() 시 자동 정렬 
		 * 2. 중복이 불가능 하다 -> 중복해 입력해도 unique 하게 나타남
		 */
		Set<String> set = new HashSet<String>();

		set.add("1");
		set.add("5");
		set.add("2");
		set.add("7");
		set.add("4");
		set.add("4");
		set.add("4");
		set.add("3");

		System.out.println(set);
		setFind(set, "5");
		setDelete(set,"5");
	}

	public static void setDelete(Set<String> set, String del) {
		for(String d : set) {
			if(d.equals(del)) {
				System.out.println(d + " 지웠다아아아아아아아ㅏㅇ");
				set.remove(d);
				return;
			}
		}
	}

	public static void setFind(Set<String> set, String find) {
		for(String f : set) {
			if(f.equals(find)) {
				System.out.println(find + " 찾았다아아아아아앙!!!");
			}
		}
	}
	
	
}
