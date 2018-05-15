package com.spoj;

import java.util.Scanner;

public class Test25025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//System.out.println(checkPitago(n));
		checkPitago(n);
	}

	// a = mn; b = (m^2 - n^2)/2; c = (m^2 + n^2)/2
	public static void checkPitago(int n) {
		int count = 0, a, b, c;
		for (int i = 1; i < n; i++) {
			for (int j = i; j <n; j++) {
				a = i * j;
				b = (int) ((Math.pow(i, 2) - Math.pow(j, 2)) / 2);
				c = (int) ((Math.pow(i, 2) + Math.pow(j, 2)) / 2);
				if (a < b && b < c && c <= n) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
						count++;
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
		//return count;
	}

}
