package com.baseball;

public class Ball {

	private int goal[];
	private int size;

	public Ball() {
		size = 3;
		goal = new int[size];
	}
	
	
	public int[] getGoal() {
		
		while (true) {

			try {

				for (int i = 0; i < size; i++) {

					goal[i] = (int) (Math.random() * 10);

					for (int j = 0; j < i; j++) {

						if (goal[j] == goal[i]) {
							i--;
							break;
						}
					}
				}

				break;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return goal;
	}
}
