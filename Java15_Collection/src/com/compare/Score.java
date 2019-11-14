package com.compare;

import java.util.Comparator;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;

	// 생성자 (기본, 파라미터 4개짜리)
	public Score() {
		this.name = "";
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		// 3개 다 더해서 리턴
		return getKor() + getEng() + getMath();
	}

	public double getAvg() {
		// 더해진 값 을 평균으로 만들어서 리턴
		return (double) getSum() / 3.0;
	}

	public String getGrade() {
		// 90~100 : A / 80~89 : B / 70~79 : C / 60~69 : D / 59~ F 리턴 해 주세요!
		switch ((int) getAvg() / 10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";

		}
	}

	// toString override
	@Override
	public String toString() {
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + " 총점 : " + getSum() + " 평균 : "
				+ getAvg() + " 등급 : " + getGrade();
	}

	@Override
	public int compareTo(Object o) {
		/*
		 * 앞의 값이 더 크면 1 같은 값이면 0 뒤의 값이 더 크면 -1
		 */

		Score other = (Score) o;

		if (this.getKor() > other.getKor()) {
			return 1;
		} else if (this.getKor() < other.getKor()) {
			return -1;
		} else if (this.getKor() == other.getKor()) {
			if (this.getEng() > other.getEng()) {
				return -1;
			} else if (this.getEng() < other.getEng()) {
				return 1;
			}
		}
		return 0;
	}
}
