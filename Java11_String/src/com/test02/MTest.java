package com.test02;

public class MTest {

	public static void main(String[] args) {
		//stringTest();
		stringBufferTest();
	}

	private static void stringBufferTest() {
		// StringBuffer = mutable : 값이 변한다.
		// -> 수정해도 heap 영역에 새로운 값이 생성되는 것이 아니라 원본 값 자체가 바뀐다.
		// -> hashcode 값이 수정 후에도 동일하다!!
		StringBuffer sb = new StringBuffer();

		sb.append("안녕하세요.");
		System.out.println(sb);
		System.out.println(" : hashCode -> " + sb.hashCode());

		// method chaining -> 메소드.메소드.메소드 이런식으로 연결하는 걸 말한다~!
		sb.append(" 저는 ").append("조현준 입니다.");
		System.out.println(sb);
		System.out.println(" : hashCode -> " + sb.hashCode());
	}

	private static void stringTest() {
		// String = immutable : 불변 객체
		// -> 수정시 스트링 풀에 새로운 literal이 생성
		// -> 수정 후에 hashcode 주소값이 변함!!
		String s = "안녕하세요.";
		System.out.println(s);
		System.out.println(" : hashCode -> " + s.hashCode());

		s += " 저는 ";
		System.out.println(s);
		System.out.println(" : hashCode -> " + s.hashCode());
		
		s += "조현준 입니다.";
		System.out.println(s);
		System.out.println(" : hashCode -> " + s.hashCode());

		
		// replace 로 수정했지만 수정한 값을 변수에 대입하지 않아서 변수는 원본을 참조하고 있고, 
		//수정본은 string pool 에 아무도 참조하지 않은 상태로 둥둥 떠있다.
		s.replace("안녕하세요.", "하이!");
		System.out.println(s);

		s = s.replace("안녕하세요.", "하이!");
		System.out.println(s);
	}
}
