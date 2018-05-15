package com.spoj;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			for (int j = x; j < n; j++) {
				if (j % x == 0 && j % y != 0)
					System.out.print(j + " ");
			}
		}
	}

}
