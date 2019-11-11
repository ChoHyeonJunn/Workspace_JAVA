package com.ant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AntQuizeUsingList {

	static Scanner sc = new Scanner(System.in);
	static ArrayList Ant = new ArrayList();
	static int dep = 0;

	public static void main(String[] args) {

		System.out.println("베르베르 개미 배열");
		System.out.println("몇 줄 까지 뽑을까요? : ");
		dep = sc.nextInt();

		getAnt(1);

//		List one = new ArrayList();
//		one.add(1);
//		List two = new ArrayList();
//		two.add(1);
//		two.add(1);
//
//		Ant.add(one);
//		Ant.add(two);

		for (int i = 0; i < Ant.size(); i++) {
			System.out.println(Ant.get(i).toString());
		}
	}

	private static Object getAnt(int td) {
		if(td > dep)
			return 0;
		
		List temp = new ArrayList();

		if (dep <= 2) {
			for (int i = 0; i < dep; i++)
				temp.add(1);
		} 
		else {
			System.out.println(Ant.size());
		}
		Ant.add(temp);
		
		return getAnt(td + 1);
	}
}
