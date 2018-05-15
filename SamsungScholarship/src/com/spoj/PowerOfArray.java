package com.spoj;

import java.util.Scanner;

public class PowerOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[50000];
		int[] f = new int[50000];
		int T = scan.nextInt();
		for (int t = 0; t < T; t++) {
			int N = scan.nextInt();
			int Sum = 0;
			int max = 1;
			for (int i = 1; i <= N; i++) {
				a[i] = scan.nextInt();
				f[a[i]]++;
				if (max <= a[i])
					max = a[i];
			}

			for (int i = 1; i <= max; i++) {
				int sum = 0;
				for (int j = 0; j <= i; j++) {
					sum += f[i];
				}
				Sum += sum;
			}

			System.out.println(Sum);
		}
	}

}
