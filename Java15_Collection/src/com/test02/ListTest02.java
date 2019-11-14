package com.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();

		for (int i = 1; i < 11; i++) {
			li.add(i + "");
		}
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		
		Collections.sort(li, new MySortTest());
		System.out.println(li);

	}

}

class MySortTest implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
//		//
//		int tmp1 = Integer.parseInt(o1);
//		int tmp2 = Integer.parseInt(o2);
//
//		if (tmp1 > tmp2)
//			return 1;
//		else if (tmp1 < tmp2)
//			return -1;
//		else
//			return 0;
		
		return -1;
	}

}