package com.spoj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test16015 {
	static int N;
	static int[] a = new int[1001];
	static int[] b = new int[1001];

	public static void sort() {
		int temp;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}

	public static void select() {
		int[] c = new int[1001];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (b[i] == 0 && c[j] == 0) {
					c[j] = a[i];
					break;
				}
				if (c[j] == 0) {
					b[i]--;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(c[i] + " ");
		}

		// int temp;
		// for (int i = 0; i < N; i++) {
		// if (b[i] != i) {
		// for (int j = i; j > b[i]; j--) {
		// temp = a[j];
		// a[j] = a[j - 1];
		// a[j - 1] = temp;
		// }
		// }
		// }
		// for (int i = 0; i < N; i++) {
		// System.out.print(a[i] + " ");
		// }
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 0; t < T; t++) {
			N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				a[i] = scan.nextInt();
			}
			for (int i = 0; i < N; i++) {
				b[i] = scan.nextInt();
			}
			sort();
			select();
			System.out.println();
		}
	}

}
