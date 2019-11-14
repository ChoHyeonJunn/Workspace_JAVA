package com.test01;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");
		v.add("안재현");
		v.add("구혜선");

//		prn(v);
//		System.out.println(v);	// 아주 이쁘게 잘나옴 -> @Override toString 했구나~~~

		transElement(v);
	}

	private static void transElement(Vector<String> v) {
		// 1. 홍길동의 인덱스를 찾아서, 해당 인덱스에 있는 값을 홍길순 으로 바꾸자.
//		for (String s : v) {
//			if (s.contentEquals("홍길동")) {
//				v.setElementAt("홍길순", v.indexOf(s));
//			}
//		}	
		v.set(v.indexOf("홍길동"), "홍길순");	//이거는 홍길동 없으면 에러나요~!
		System.out.println(v);
	

		// 2. "신" 으로 끝나는 객체를 찾아서, 만일 있다면 "신"을 "자"로 바꾸자.
		for (String s : v) {
			if (s.endsWith("신")) {
				v.setElementAt(s.replace('신', '자'), v.indexOf(s));
			}
		}
		System.out.println(v);

		// 3. "호" 으로 끝나는 객체를 찾아서, 만일 있다면 삭제하자.
		Vector<Integer> del = new Vector<Integer>();		
		for (String s : v) {
			if (s.endsWith("호")) {
				//여기서 바로지우면 ConcurrentModificationException : 향상된 for문에서 loop 중간에 v의 size가 줄어들면 문제가 생긴다!~
				del.add(v.indexOf(s));
			}
		}		
		for (int i : del) {
			v.remove(i);
		}

		//이렇게 하면 에러가 안나지요~!
//		for(int i=0;i<v.size();i++) {
//			if(v.get(i).endsWith("호"))
//				v.remove(i);
//		}
		
		System.out.println(v);

	}

	private static void prn(Vector<String> v) {
		// TODO Auto-generated method stub
		// 향상된 for문 (forEach) for(
		for (String s : v) {
			System.out.printf("%s\t", s);
		}
	}

}
