package com.test03;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public int getSum() {
		return getKor() + getEng() + getMath();
	}

	public double getAvg() {

		return getSum() / 3;
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

	@Override
	public String toString() {

		return "이름 : " + getName() + " 국어 : " + getKor() + " 영어 : " + getEng() + " 수학 : " + getMath() + " 총점 : " + getSum()
				+ " 평균 : " + getAvg() + " 등급 : " + getGrade();
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

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
}
