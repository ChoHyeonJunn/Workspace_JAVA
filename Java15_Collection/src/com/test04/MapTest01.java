package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 111; i < 116; i++) {
			map.put(i, i + 1000);
		}

		map.put(112, 1113);

		System.out.println(map);
		System.out.println(map.get(112));

		prn(map);

	}

	private static void prn(Map<Integer, Integer> map) {
		// TODO Auto-generated method stub

		// key 따로 value 따로 접근할 수 있는 set을 구성
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//
//		for (Entry<Integer, Integer> entry : entrySet) {
//			//System.out.println(entry.getKey() + " : " + entry.getValue());
//			
//			if(entry.getValue() == 1113) {
//				System.out.println(entry.getKey());
//			}
//		}
		
		//iterator 를 사용해서 위의 forEach문과 같은 결과를 출력하자
		
		Iterator<Map.Entry<Integer, Integer>> iter = entrySet.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, Integer> tmp = iter.next();
			
			if(tmp.getValue() == 1113) {
				System.out.println(tmp.getKey());
			}
		}
		
		
	}
}
