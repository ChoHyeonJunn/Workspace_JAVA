package com.test04;

public class MTest {

	/*
	 * main method 는 프로그램이 시작될 때 최초로 접근
	 * 접근 제한자 : public (어디서나 접근 가능)
	 * 메모리영역 : static ()
	 * 리턴타입 : void (리턴값이 없다)
	 * 파라미터 : String[] args ()
	 */
	public static void main(String[] args) {
		int kor, eng, math;		//변수 선언
		kor = eng = math = 0;	//변수에 값 할당
		
		kor = 100;
		eng = 100;
		math = 100;
		
		int sum = getSum(kor, eng, math);
		double avg = getAvg(sum);
		
		System.out.println("총점은 : " + sum + " 평균은 : " + String.format("%.2f", avg));
	}
	
	//1. 국어, 영어, 수학 점수를 받아서 총 점을 리턴하는 메서드를 맹글자~
	//접근제한자는 default, 메모리영역은 static, 리턴타입은 int
	//파라미터는 int형 변수 3개, 이름은 getSum
	static int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	//2. 총점을 받아서 평균을 리턴하는 메서드를 맹글자~
	//접근제한자는 private, 메모리영역은 static, 리턴타입은 double
	//파라미터는 int형 변수 1개, 이름은 getAvg
	private static double getAvg(int sum) {
		double avg = (double)sum / 3;
		return avg;
	}
	
	//3. main 메서드에서 getSum과 getAvg를 호출하여, 총점과 평균을 출력하라.
}
