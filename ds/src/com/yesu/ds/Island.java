package com.yesu.ds;

public class Island {

	private int n = 0;
	private int m = 0;

	private int[][] coordinates;
	private int numIslands = 0;

	private boolean recalcNeeded = false;

	public Island(int m, int n) {
		this.m = m;
		this.n = n;

		coordinates = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				coordinates[i][j] = 0;
			}
		}
	}

	public int getNumIslands() {
		if (!recalcNeeded) {
			return numIslands;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				if (coordinates[i][j] == 1) {
					mergeIslands(coordinates, i, j);
					++numIslands;
				}
		}
		return numIslands;
	}

	public void addLand(int x, int y) {
		if (x < 0 || y >= n) {
			throw new RuntimeException("Out of range");
		}

		if (y < 0 || y >= m) {
			throw new RuntimeException("Out of range");
		}

		if (coordinates[x][y] == 1) {
			return;
		}

		coordinates[x][y] = 1;
		recalcNeeded = true;
	}

	private void mergeIslands(int[][] cooridnates, int i, int j) {
		if (i < 0 || i >= n) {
			return;
		}

		if (j < 0 || j >= m) {
			return;
		}

		if (cooridnates[i][j] == 0)
			return;

		cooridnates[i][j] = 0;
		mergeIslands(cooridnates, ++i, j);
		mergeIslands(cooridnates, --i, j);
		mergeIslands(cooridnates, i, ++j);
		mergeIslands(cooridnates, i, --j);
	}
}