package com.spoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test1840a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = input.nextInt();
			if (n == 1) {
				System.out.println(1);
				continue;
			}
			int[] a = new int[n];
			int[] b = new int[n];
			int m = input.nextInt();

			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
				b[i] = i;
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int temp;
					if (a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;

						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
			int x = 0;
			while (b[x] != m) {
				x++;
			}
			System.out.println(x + 1);

		}
	}

}
