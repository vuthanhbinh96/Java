package com.spoj;

import java.util.Scanner;

public class Test1706 {

	final static int Q = 0;
	final static int K = 1;
	final static int P = 2;
	final static int Safe = 3;
	final static int Unsafe = 4;

	static int[][] Board = new int[1000][1000];
	static int ROW, COL;

	static int[] K_row = { -1, -2, 1, 2, -2, -1, 2, 1 };
	static int[] K_col = { 2, 1, 2, 1, -1, -2, -1, -2 };

	public static int checkK(int row, int col) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			int r = row + K_row[i];
			int c = col + K_col[i];
			if (r <= ROW && r >= 0 && c >= 0 && c <= COL) {
				if (Board[r][c] == Safe) {
					Board[r][c] = Unsafe;
					count++;
				}
			}
		}

		return count;
	}

	static int[] Q_row = { 0, 0, 1, 1, 1, -1, -1, -1 };
	static int[] Q_col = { 1, -1, -1, 0, 1, -1, 0, 1 };
	static int Sum = 0;

	static void checkQ(int row, int col, int direct) {
		int r = row + Q_row[direct];
		int c = col + Q_col[direct];

		if (r <= ROW && r >= 0 && c <= COL && c >= 0) {
			if (Board[r][c] == Safe) {
				Board[r][c] = Unsafe;
				Sum--;
				checkQ(r, c, direct);
			} else if (Board[r][c] == Unsafe) {
				checkQ(r, c, direct);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = 0;

		while (true) {
			ROW = scan.nextInt();
			COL = scan.nextInt();
			if (ROW == 0 && COL == 0)
				break;
			tc++;
			Sum = COL * ROW;
			ROW--;
			COL--;

			for (int r = 0; r <= ROW; r++) {
				for (int c = 0; c <= COL; c++) {
					Board[r][c] = Safe;
				}
			}

			int r, c;
			int[][] row = new int[2][100];
			int[][] col = new int[2][100];
			int[] num = new int[3];

			for (int i = 0; i < 3; i++) {
				num[i] = scan.nextInt();
				for (int j = 0; j < num[i]; j++) {
					r = scan.nextInt();
					c = scan.nextInt();
					Board[r - 1][c - 1] = i;
					if (i != 2) {
						row[i][j] = r - 1;
						col[i][j] = c - 1;
					}
				}
			}

			Sum -= num[Q] + num[K] + num[P];

			for (int j = 0; j < num[K]; j++) {
				Sum -= checkK(row[K][j], col[K][j]);
			}

			for (int j = 0; j < num[Q]; j++) {
				for (int i = 0; i < 8; i++) {
					checkQ(row[Q][j], col[Q][j], i);
				}
			}

			System.out.println("Board " + tc + " has " + Sum + " safe squares.");
		}
	}

}
