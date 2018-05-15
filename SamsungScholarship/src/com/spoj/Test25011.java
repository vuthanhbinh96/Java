package com.spoj;

import java.util.Scanner;

public class Test25011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i = 0;
		while (m > n) {

			n = n + n / 10;
			i++;

		}
		System.out.println(i);
	}
}
