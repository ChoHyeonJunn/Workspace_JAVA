package com.battleship;

public class Map {

	private int[][] direct = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	private int[][] Map = new int[SIZE][SIZE];
	private int[][] Bomb = new int[SIZE][SIZE];

	private static final int SIZE = 10;

	private Pair<Integer, Integer> carrierHead;
	private Pair<Integer, Integer> carrierTail;

	private Pair<Integer, Integer> battleshipHead;
	private Pair<Integer, Integer> battleshipTail;

	private Pair<Integer, Integer> fightshipHead;
	private Pair<Integer, Integer> fightshipTail;
	
	public boolean noMoreShip(int[][] map) {
		int cnt = 0;
		
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				if(map[i][j] == 1)
					cnt++;
			}
		}
		
		if(cnt == 0)
			return true;
		else
			return false;
	}

	public boolean getCompatibility(int hi, int hj, int ti, int tj, int len) {
		if (0 <= hi && hi < SIZE && 0 <= hj && hj < SIZE && 0 <= ti && ti < SIZE && 0 <= tj && tj < SIZE) {

			if (hi == ti && (Math.max(hj, tj) - Math.min(hj, tj)) == len) {

				for (int i = Math.min(hj, tj); i <= Math.max(hj, tj); i++) {
					Map[hi][i] = 1;
				}

				return true;
				
			} else if (hj == tj && (Math.max(hi, ti) - Math.min(hi, ti)) == len) {

				for (int i = Math.min(hi, ti); i <= Math.max(hi, ti); i++) {
					Map[i][hj] = 1;
				}

				return true;
				
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}

	public boolean setCarrier(Pair<Integer, Integer> carrierHead, Pair<Integer, Integer> carrierTail) {
		this.carrierHead = carrierHead;
		this.carrierTail = carrierTail;

		int hi = (int) this.carrierHead.left;
		int hj = (int) this.carrierHead.right;

		int ti = (int) this.carrierTail.left;
		int tj = (int) this.carrierTail.right;

		return getCompatibility(hi, hj, ti, tj, 4);
	}

	public boolean setBattleship(Pair<Integer, Integer> battleshipHead, Pair<Integer, Integer> battleshipTail) {
		this.battleshipHead = battleshipHead;
		this.battleshipTail = battleshipTail;

		int hi = (int) battleshipHead.left;
		int hj = (int) battleshipHead.right;

		int ti = (int) battleshipTail.left;
		int tj = (int) battleshipTail.right;

		return getCompatibility(hi, hj, ti, tj, 3);
	}

	public boolean setFightship(Pair<Integer, Integer> fightshipHead, Pair<Integer, Integer> fightshipTail) {
		this.fightshipHead = fightshipHead;
		this.fightshipTail = fightshipTail;

		int hi = (int) fightshipHead.left;
		int hj = (int) fightshipHead.right;

		int ti = (int) fightshipTail.left;
		int tj = (int) fightshipTail.right;
		
		return getCompatibility(hi, hj, ti, tj, 1);
	}

	public int[][] getMap() {
		return Map;
	}

	public void setMap(int[][] map, int x, int y) {
		if (0 <= x && x < map.length && 0 <= y && y < map.length) {
			map[x][y] = 0;
		}		
		Map = map;
	}

	public int[][] getBomb() {
		return Bomb;
	}

	public void setBomb(int[][] bomb) {
		Bomb = bomb;
	}

}
