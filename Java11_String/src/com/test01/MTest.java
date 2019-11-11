package com.test01;

public class MTest {

	static String str = "The String class represents character strings.";

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(1 + 2 + s);
		System.out.println(s);
		s = s + 1 + 2;
		System.out.println(s);
		// String concatenation

//		 1. str의 전체 길이 (출력)
		System.out.println("1. str의 전체 길이 (출력)");
		System.out.println(str.length());
		System.out.println();

//		 2. str 전체 대문자로 바꿔서
		System.out.println("2. str 전체 대문자로 바꿔서");
		System.out.println(str.toUpperCase());
		System.out.println();
		
//		 3. str 전체 소문자로 바꿔서
		System.out.println("3. str 전체 소문자로 바꿔서");
		System.out.println(str.toLowerCase());
		System.out.println();
		
//		 4. str에서 첫번째로 나오는 c의 인덱스를
		System.out.println("4. str에서 첫번째로 나오는 c의 인덱스를");
		System.out.println(str.indexOf('c'));
		System.out.println();
		
//		 5. class -> java 로 바궈서
		System.out.println("5. class -> java 로 바궈서");
		str = str.replace("class", "java");
		System.out.println(str);
		System.out.println();
		
//		 6. character 찾아서 대문자로 변환 후, 변환된 내용으로 전체 출력

		System.out.println("6. character 찾아서 대문자로 변환 후, 변환된 내용으로 전체 출력");
		str = str.replace("character", str.substring(str.indexOf("character"), str.indexOf("character") + 9).toUpperCase());
		System.out.println(str);
		System.out.println();
		
		//이렇게 풀수도 있다!!
//		String target = "character";
//		int start = str.indexOf(target);
//		int end = start + target.length();
//		
//		String upper = str.substring(start, end).toUpperCase();
//		
//		System.out.println(str.replace(target, upper));
		
//		 7. str을 char[] 로 출력하되, 'c' 만 출력하자. 그리고 c의 갯수도 출력하자

		System.out.println("7. str을 char[] 로 출력하되, 'c' 만 출력하자. 그리고 c의 갯수도 출력하자");
		char[] str_c01 = str.toCharArray();
		int num1 = 0;
		for (int i = 0; i < str_c01.length; i++) {
			if (str_c01[i] == 'c' || str_c01[i]	== 'C') {
				System.out.print(str_c01[i] + " ");
				num1++;
			}
		}
		System.out.println(num1);
		System.out.println();
		
//		 8. str을 char[] 로 출력하되, 대문자만, 그리고 대문자의 갯수도

		System.out.println("8. str을 char[] 로 출력하되, 대문자만, 그리고 대문자의 갯수도");
		char[] str_c02 = str.toCharArray();
		int num2 = 0;
		for (int i = 0; i < str_c02.length; i++) {
			if (Character.isUpperCase(str_c02[i])) {
				System.out.print(str_c02[i] + " ");
				num2++;
			}
		}
		System.out.println(num2);
		System.out.println();
		
//		 9. str 안의 모든 공백 제거 후 출력

		System.out.println("9. str 안의 모든 공백 제거 후 출력");
		str = str.replace(" ", "");
		//str.replaceAll(" ", "");	// regex 를 이용해 자를수도 있다. (replace랑 차이점)
		System.out.println(str);
		System.out.println();
		
//		 10. 전체 역순으로 출력

		System.out.println("10. 전체 역순으로 출력");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
