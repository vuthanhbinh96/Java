package com.spoj;

import java.util.Scanner;

public class Test24992 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(fibonaci(i));
		}
	}

	public static int fibonaci(int n) {
		if (n == 1 || n == 0)
			return n;
		else
			return fibonaci(n - 1) + fibonaci(n - 2);
	}

}
