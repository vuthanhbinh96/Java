package com.spoj;

import java.util.Scanner;

public class Test26651 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int N = scan.nextInt();
			int[] arr = new int[N];
			int Store = 0;

			for (int j = 0; j < N; j++) {
				arr[j] = scan.nextInt();
			}

			for (int j = 1; j < N - 1; j++) {
				int maxL = arr[j - 1], maxR = arr[j + 1];
				for (int a = j - 1; a >= 0; a--) {
					if (maxL < arr[a])
						maxL = arr[a];
				}

				for (int b = j + 1; b < N; b++) {
					if (maxR < arr[b])
						maxR = arr[b];
				}

				int store = Integer.min(maxR, maxL) - arr[j];
				if (store > 0)
					Store += store;
			}
			System.out.println(Store);
		}
	}

}
