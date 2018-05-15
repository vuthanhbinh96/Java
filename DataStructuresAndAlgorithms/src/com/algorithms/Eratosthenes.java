package com.algorithms;

import java.util.Scanner;
import java.util.Vector;

public class Eratosthenes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] mark = new int[n+1];
		for (int i = 0; i <= n; i++) {
			mark[i] = 0;
		}

		for (int i = 2; i * i <= n; i++) {
			if (mark[i] == 0) {
				for (int j = i * i; j <= n; j += i) {
					mark[j] = 1;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (mark[i] == 0)
				System.out.println(i);
		}
		input.close();
	}

}
