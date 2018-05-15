package com.spoj;

import java.util.Scanner;

public class Test302 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {

			int test = scan.nextInt();
			int temp = 1;
			int a = test;

			while (test > temp) {
				test = test - temp;
				temp++;
			}

			if (temp % 2 != 0) {
				System.out.println("TERM " + a + " IS " + (temp + 1 - test) + "/" + test);
			} else {
				System.out.println("TERM " + a + " IS " + test + "/" + (temp + 1 - test));
			}
		}

	}

}
