package com.baseball;

// Ball에서 만든 목표 배열과 User에서 입력받은 배열을 비교
public class Referee {

	// 0번지 : strike 갯수
	// 1번지 : ball 갯수
	// 2번지 : out 갯수

	public int[] isStrike(int[] goal, int[] inputArr) {

		int[] output = new int[3];

		int strike = 0;
		int ball = 0;

		for (int i = 0; i < goal.length; i++) {

			for (int j = 0; j < inputArr.length; j++) {

				if (goal[i] == inputArr[j]) {

					if (i == j)
						strike++;
					else
						ball++;
				}
			}
		}
		
		if(strike + ball == 0) {
			output[2] = 3;
		} else {
			output[0] = strike;
			output[1] = ball;
		}

		return output;
	}
}
