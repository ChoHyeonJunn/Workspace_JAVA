package com.test03;

public class MTest {

	public static void main(String[] args) {
		/*
		 * score 클래스를 완성하자.
		 * getAvg 메서드는 국어 영어 수학 점수를 전달하면 평균을 리턴해준다.
		 * getGrade 메서드는 평균을 전달하면
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : c
		 * 60~69 : d
		 * 0~59 : f
		 * 를 리턴해 준다.
		 * 
		 * "ㅁㅁㅁ"평균은 xx.xx점 이고, 등급은 'ㅌ' 입니다" 라고 출력!
		 */
		
		
		Score score = new Score();
		
		double avg = score.getAvg(80, 81, 99);
		String grade = score.getGrade(avg);
		
		System.out.println("조현준 평균은 " + String.format("%.2f", avg) + "점 이고, 등급은 " + grade + " 입니다.");
	}
	
	
}
