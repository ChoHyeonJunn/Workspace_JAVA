package com.test03;

public class Score {

	public double getAvg(int kor, int eng, int math) {
		return ((double)kor + (double)eng + (double)math)/3;
		//return (kor + eng + math)/3.0;
		//return (double)(kor + eng + math)/3;
	}
	
	public String getGrade(double avg) {
		String str = "";

		switch((int)avg / 10) {
		case 10: 
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;
		case 6:
			str = "D";
			break;
		default:
			str = "F";
			break;
		}
		return str;
	}
}
