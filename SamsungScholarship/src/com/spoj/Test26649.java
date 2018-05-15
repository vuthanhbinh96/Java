package com.spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test26649 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {

			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] al = new int[n];
			int j;
			for (j = 0; j < n; j++) {
				al[j] = scan.nextInt();
			}

			int front = 0, back = 0;
			int max_len = 0;
			int zeros = 0;

			while (back < n) {
				if (al[back] == 0)
					zeros++;
				if (zeros <= k)
					max_len = Integer.max(back - front + 1, max_len);
				else {
					while (zeros > k && front < back) {
						if (al[front] == 0)
							zeros--;
						front++;
					}
				}
				back++;
			}
			System.out.println(max_len);
		}

	}

}
