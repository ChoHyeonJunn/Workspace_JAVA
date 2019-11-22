package com.make;

public class Mine {

	private int size;
	private String[][] arr;		// 컴퓨터용 맵

	public Mine() {
		size = 10;
	}

	public Mine(int size) {
		this.size = size;
	}

	public String[][] make() {

		arr = new String[size][size];

		fillZero();
		randomMine();
		cntMine();

		return arr;
	}
	

	public String[][] getArr() {
		return arr;
	}
	

	// 맵을 @로 채우기
	private void fillZero() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = "@";
			}
		}
	}

	// 랜덤으로 지뢰 뿌리기
	private void randomMine() {

		int cnt = size;

		while (cnt != 0) {

			int ranX = (int) (Math.random() * size);
			int ranY = (int) (Math.random() * size);

			if (!(arr[ranX][ranY] == "*")) {
				arr[ranX][ranY] = "*";
				cnt--;
			}
		}
	}

	// 맵 출력하기
	public void prn() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.printf("%3s", arr[i][j]);

			}

			System.out.println();
		}
	}


	private void cntMine() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (!arr[i][j].equals("*")) {

					arr[i][j] = String.valueOf(count(i, j)); // Integer.toString(count(i,j));

				}
			}
		}
	}

	
	// 지뢰 갯수 세기
	private int count(int x, int y) {

		int cnt = 0;

		for (int i = x - 1; i <= x + 1; i++) {

			for (int j = y - 1; j <= y + 1; j++) {

				// 맵의 범위가 아니면
				if (i < 0 || j < 0 )
					continue; // 넘어가라

				if(i > arr.length - 1 || j > arr.length - 1)
					continue;
				
				// 지뢰라면
				if (arr[i][j].equals("*")) {
					cnt++;
				}
			}
		}

		return cnt;
	}
	
}
