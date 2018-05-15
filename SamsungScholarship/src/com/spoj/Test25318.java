package com.spoj;

import java.util.Scanner;

public class Test25318 {

	public static void main(String[] args) {
		int[][] arr = new int[100][100];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 0, b = 0, c1 = 0, c2 = 0, d1 = 0, d2 = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j)
					a += arr[i][j];
				if (i + j + 1 == n)
					b += arr[i][j];
				if (i + 1 == j)
					c1 += arr[i][j];
				if (i == j + 1)
					c2 += arr[i][j];
				if (i + j + 2 == n)
					d1 += arr[i][j];
				if (i + j == n)
					d2 += arr[i][j];
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1 + " " + c2);
		System.out.println(d1 + " " + d2);
	}

}
