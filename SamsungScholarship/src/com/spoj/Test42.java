package com.spoj;

import java.util.Scanner;

public class Test42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int tong = getReversed(a) + getReversed(b);
			System.out.println(getReversed(tong));
		}

	}

	public static int getReversed(int a) {

		int n = 0;
		int sum = 0;

		while (a > 0) {
			n = a % 10;
			a = a / 10;
			sum = sum * 10 + n;
		}

		return sum;

	}

}
