package com.spoj;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int m = input.nextInt();
			int n = input.nextInt();
			int[] mark = new int[n + 1];

			for (int i = 0; i <= n; i++) {
				mark[i] = 0;
			}

			mark[0] = 1;
			mark[1] = 1;
			
			for (int i = m; i * i <= n; i++) {
				if (mark[i] == 0) {
					for (int j = i * i; j <= n; j += i) {
						mark[j] = 1;
					}
				}
			}

			for (int i = m; i <= n; i++) {
				if (mark[i] == 0)
					System.out.println(i);
			}
		}

		input.close();
	}

}
