package com.spoj;

import java.util.Scanner;

public class Test1112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int check = findNumber(x, y);
			if (check == -1)
				System.out.println("No Number");
			else
				System.out.println(findNumber(x, y));

		}
	}

	public static int findNumber(int x, int y) {
		if (y <= x && x <= y + 2) {
			if (x % 2 == 0 && y % 2 == 0) {
				return x + y;
			}
			if (x % 2 == 1 && y % 2 == 1) {
				return x + y - 1;
			}
		}
		return -1;
	}

}
