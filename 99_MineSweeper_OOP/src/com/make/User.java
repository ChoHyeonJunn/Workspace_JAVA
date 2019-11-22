package com.make;

public class User {

	private int size;

	private String[][][] user; // 사용자가 보는 맵

	public User() {
		size = 10;
	}

	public User(int size) {
		this.size = size;
	}

	public String[][][] user() {

		user = new String[size][size][2];

		fillZero();
		
		return user;
	}
	

	// 맵을 0으로 채우기
	private void fillZero() {

		for (int i = 0; i < user.length; i++) {

			for (int j = 0; j < user[i].length; j++) {

				user[i][j][0] = "■";
				user[i][j][1] = "0";
			}
		}
	}

	public void prnUser() {

		for (int i = 0; i < user.length; i++) {

			for (int j = 0; j < user[i].length; j++) {

				System.out.printf("%3s", user[i][j][0]);

			}

			System.out.println();
		}
	}
	
	
	// 입력받은 좌표를 대입해서 맵 출력하기
	public void click(int x, int y, String[][] arr) {
		
		for(int i=x-1; i<=x+1; i++) {
			
			for(int j=y-1; j<=y+1; j++) {
				
				// 맵의 범위가 아니면
				if (i < 0 || j < 0 )
					continue; // 넘어가라

				if(i > arr.length - 1 || j > arr.length - 1)
					continue;
				
				if(arr[i][j].equals("0") && user[i][j][1].equals("0")) {
					user[i][j][0] = arr[i][j];
					user[i][j][1] = "1";
					
					click(i,j,arr);
				}
				
				if(arr[i][j].equals("0") && user[i][j][1].equals("0")) {
					user[i][j][0] = arr[i][j];
					user[i][j][1] = "1";
				}
			}
		}
		
	}
}
