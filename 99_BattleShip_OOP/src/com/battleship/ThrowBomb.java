package com.battleship;

public class ThrowBomb {

	
	public static boolean getBomb(int[][] map, Pair<Integer, Integer> bomb) {
		
		if(map[bomb.left][bomb.right] != 0) {
			return true;			
		}		
		return false;
	}
}

