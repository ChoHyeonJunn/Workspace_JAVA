package com.make;

public class Mine {

	private static int[][] direct = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
			{ -1, -1 } };
	
	private int size;
	private String[][] arr;

	public Mine() {
		size = 10;
	}

	public Mine(int size) {
		this.size = size;
	}

	public String[][] make() {
		arr = new String[size][size];

		fillTheZero();
		randomMine();

		return arr;
	}

	//랜덤으로 지뢰를 깔아준다~!
	private void randomMine() {
		int cnt = size;
		
		while(cnt != 0) {
			
			int ranX = (int)(Math.random() * size);
			int ranY = (int)(Math.random() * size);
			
			if(!arr[ranX][ranY].equals("*")) {
				arr[ranX][ranY] = "*";			
				
				for(int i=0;i<8;i++) {
					int mx = ranX + direct[i][0];
					int my = ranY + direct[i][1];
					
					if (0 <= mx && mx < 10 && 0 <= my && my < 10) {
						if (!arr[mx][my].equals("*")) {
							int temp = Integer.parseInt(arr[mx][my]);
							arr[mx][my] = Integer.toString(++temp);
						}
					}
				}			
				
				cnt--;
			}		
		}
		
	}

	//map arr 을 모두 0으로 초기화한다!!
	private void fillTheZero() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "0";
			}
		}

	}
	
	public void prn() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
